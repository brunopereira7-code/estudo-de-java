package view;
import Controle.ProdutoControle;
import modelo.Produto;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class TelaProduto extends JFrame {
    private JTextField txtId, txtNome, txtCategoria, txtPreco, txtQtd;
    private JButton btnSalvar, btnAlterar, btnRemover, btnPesquisar;
    private JTable tabela;
    private DefaultTableModel modeloTabela;
    private ProdutoControle controle;

    public TelaProduto() {
        controle = new ProdutoControle();
        setTitle("Cadastro de Produtos");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        
        int x = 20, y = 20, width = 100, height = 25;
        
        add(new JLabel("ID:")).setBounds(x, y, width, height);
        txtId = new JTextField();
        txtId.setBounds(x + 50, y, 50, height);
        add(txtId);

        add(new JLabel("Nome:")).setBounds(x + 120, y, width, height);
        txtNome = new JTextField();
        txtNome.setBounds(x + 170, y, 150, height);
        add(txtNome);

        y += 40;
        add(new JLabel("Categoria:")).setBounds(x, y, width, height);
        txtCategoria = new JTextField();
        txtCategoria.setBounds(x + 70, y, 100, height);
        add(txtCategoria);

        add(new JLabel("Preço:")).setBounds(x + 180, y, width, height);
        txtPreco = new JTextField();
        txtPreco.setBounds(x + 230, y, 80, height);
        add(txtPreco);

        add(new JLabel("Qtd:")).setBounds(x + 320, y, width, height);
        txtQtd = new JTextField();
        txtQtd.setBounds(x + 350, y, 50, height);
        add(txtQtd);

        
        y += 40;
        btnSalvar = new JButton("Salvar");
        btnSalvar.setBounds(x, y, 100, 30);
        add(btnSalvar);

        btnAlterar = new JButton("Alterar");
        btnAlterar.setBounds(x + 110, y, 100, 30);
        add(btnAlterar);

        btnRemover = new JButton("Remover");
        btnRemover.setBounds(x + 220, y, 100, 30);
        add(btnRemover);

        btnPesquisar = new JButton("Pesquisar ID");
        btnPesquisar.setBounds(x + 330, y, 120, 30);
        add(btnPesquisar);

        
        y += 50;
        modeloTabela = new DefaultTableModel(new String[]{"ID", "Nome", "Categoria", "Preço", "Qtd"}, 0);
        tabela = new JTable(modeloTabela);
        JScrollPane scrollPane = new JScrollPane(tabela);
        scrollPane.setBounds(20, y, 540, 250);
        add(scrollPane);

        
        btnSalvar.addActionListener(e -> {
            controle.adicionarProduto(
                Integer.parseInt(txtId.getText()), txtNome.getText(), 
                txtCategoria.getText(), Double.parseDouble(txtPreco.getText()), 
                Integer.parseInt(txtQtd.getText())
            );
            atualizarTabela();
            limparCampos();
        });

        btnAlterar.addActionListener(e -> {
            controle.alterarProduto(
                Integer.parseInt(txtId.getText()), txtNome.getText(), 
                txtCategoria.getText(), Double.parseDouble(txtPreco.getText()), 
                Integer.parseInt(txtQtd.getText())
            );
            atualizarTabela();
            limparCampos();
        });

        btnRemover.addActionListener(e -> {
            controle.deletarProduto(Integer.parseInt(txtId.getText()));
            atualizarTabela();
            limparCampos();
        });

        btnPesquisar.addActionListener(e -> {
            Produto p = controle.pesquisarProduto(Integer.parseInt(txtId.getText()));
            if(p != null) {
                txtNome.setText(p.getNome());
                txtCategoria.setText(p.getCategoria());
                txtPreco.setText(String.valueOf(p.getPreco()));
                txtQtd.setText(String.valueOf(p.getQuantidadeEstoque()));
            } else {
                JOptionPane.showMessageDialog(this, "Produto não encontrado!");
            }
        });
    }

    private void atualizarTabela() {
        modeloTabela.setRowCount(0); // Limpa a tabela
        List<Produto> lista = controle.buscarTodos();
        for (Produto p : lista) {
            modeloTabela.addRow(new Object[]{p.getId(), p.getNome(), p.getCategoria(), p.getPreco(), p.getQuantidadeEstoque()});
        }
    }

    private void limparCampos() {
        txtId.setText(""); txtNome.setText(""); txtCategoria.setText(""); txtPreco.setText(""); txtQtd.setText("");
    }
}
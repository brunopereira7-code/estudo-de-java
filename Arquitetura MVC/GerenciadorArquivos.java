import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GerenciadorArquivos {

    
    private static final File DIRETORIO = new File("LABORATORIO");

    public static void main(String[] args) {
        
        if (!DIRETORIO.exists()) {
            DIRETORIO.mkdirs();
        }

        boolean executando = true;

        while (executando) {
            String menu = "=== GERENCIADOR DE ARQUIVOS (LABORATORIO) ===\n\n"
                    + "1 - Criar arquivo\n"
                    + "2 - Escrever no arquivo\n"
                    + "3 - Ler arquivo\n"
                    + "4 - Renomear arquivo\n"
                    + "5 - Excluir arquivo\n"
                    + "6 - Mostrar informações do arquivo\n"
                    + "7 - Tornar somente leitura (Desafio)\n"
                    + "8 - Sair\n\n"
                    + "Escolha uma opção:";

            String opcaoInput = JOptionPane.showInputDialog(null, menu, "Menu Principal", JOptionPane.QUESTION_MESSAGE);

            
            if (opcaoInput == null) {
                encerrarSistema();
                break;
            }

            switch (opcaoInput.trim()) {
                case "1":
                    criarArquivo();
                    break;
                case "2":
                    escreverArquivo();
                    break;
                case "3":
                    lerArquivo();
                    break;
                case "4":
                    renomearArquivo();
                    break;
                case "5":
                    excluirArquivo();
                    break;
                case "6":
                    mostrarInformacoes();
                    break;
                case "7":
                    protegerArquivo();
                    break;
                case "8":
                    encerrarSistema();
                    executando = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.", "Aviso", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    
    private static void criarArquivo() {
        String nome = solicitarNomeArquivo("Digite o nome do arquivo com extensão (ex: atividade.txt):");
        if (nome == null) return;

        File arquivo = new File(DIRETORIO, nome);

        if (arquivo.exists()) {
            JOptionPane.showMessageDialog(null, "Erro: O arquivo já existe em LABORATORIO!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            if (arquivo.createNewFile()) {
                JOptionPane.showMessageDialog(null, "Arquivo '" + nome + "' criado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível criar o arquivo.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao criar arquivo: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    private static void escreverArquivo() {
        String nome = solicitarNomeArquivo("Digite o nome do arquivo em que deseja escrever:");
        if (nome == null) return;

        File arquivo = new File(DIRETORIO, nome);

        if (!validarExistencia(arquivo)) return;

        if (!arquivo.canWrite()) {
            JOptionPane.showMessageDialog(null, "Erro: O arquivo é somente leitura!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String conteudo = JOptionPane.showInputDialog(null, "Digite o texto a ser gravado:", "Escrever", JOptionPane.QUESTION_MESSAGE);
        if (conteudo == null) return; // Cancelado

        try (FileWriter writer = new FileWriter(arquivo, true)) { // 'true' para adicionar conteúdo ao final
            writer.write(conteudo + System.lineSeparator());
            JOptionPane.showMessageDialog(null, "Conteúdo gravado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao escrever no arquivo: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    private static void lerArquivo() {
        String nome = solicitarNomeArquivo("Digite o nome do arquivo para leitura:");
        if (nome == null) return;

        File arquivo = new File(DIRETORIO, nome);

        if (!validarExistencia(arquivo)) return;

        StringBuilder texto = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                texto.append(linha).append("\n");
            }

            if (texto.length() == 0) {
                JOptionPane.showMessageDialog(null, "O arquivo está vazio.", "Conteúdo do Arquivo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, texto.toString(), "Conteúdo de " + nome, JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    private static void renomearArquivo() {
        String nomeAtual = solicitarNomeArquivo("Digite o nome atual do arquivo:");
        if (nomeAtual == null) return;

        File arquivoAtual = new File(DIRETORIO, nomeAtual);
        if (!validarExistencia(arquivoAtual)) return;

        String novoNome = solicitarNomeArquivo("Digite o novo nome do arquivo:");
        if (novoNome == null) return;

        File novoArquivo = new File(DIRETORIO, novoNome);

        if (novoArquivo.exists()) {
            JOptionPane.showMessageDialog(null, "Erro: Já existe um arquivo com o novo nome informado!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (arquivoAtual.renameTo(novoArquivo)) {
            JOptionPane.showMessageDialog(null, "Arquivo renomeado com sucesso para '" + novoNome + "'!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Falha ao renomear o arquivo.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    private static void excluirArquivo() {
        String nome = solicitarNomeArquivo("Digite o nome do arquivo a ser excluído:");
        if (nome == null) return;

        File arquivo = new File(DIRETORIO, nome);
        if (!validarExistencia(arquivo)) return;

        int confirmacao = JOptionPane.showConfirmDialog(
                null,
                "Tem certeza que deseja excluir o arquivo '" + nome + "'?",
                "Confirmação de Exclusão",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE
        );

        if (confirmacao == JOptionPane.YES_OPTION) {
            if (arquivo.delete()) {
                JOptionPane.showMessageDialog(null, "Arquivo excluído com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao excluir o arquivo.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Operação de exclusão cancelada.", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    
    private static void mostrarInformacoes() {
        String nome = solicitarNomeArquivo("Digite o nome do arquivo para consultar informações:");
        if (nome == null) return;

        File arquivo = new File(DIRETORIO, nome);
        if (!validarExistencia(arquivo)) return;

        
        String extensao = "Sem extensão";
        int pontoIndex = nome.lastIndexOf('.');
        if (pontoIndex > 0 && pontoIndex < nome.length() - 1) {
            extensao = nome.substring(pontoIndex + 1);
        }

        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String ultimaModificacao = sdf.format(new Date(arquivo.lastModified()));

        String info = "=== INFORMAÇÕES DO ARQUIVO ===\n\n"
                + "Nome: " + arquivo.getName() + "\n"
                + "Extensão: " + extensao + "\n"
                + "Tamanho: " + arquivo.length() + " bytes\n"
                + "Caminho Completo: " + arquivo.getAbsolutePath() + "\n"
                + "Permissão de Leitura: " + (arquivo.canRead() ? "Sim" : "Não") + "\n"
                + "Permissão de Gravação: " + (arquivo.canWrite() ? "Sim" : "Não") + "\n"
                + "Permissão de Execução: " + (arquivo.canExecute() ? "Sim" : "Não") + "\n"
                + "Última Modificação: " + ultimaModificacao;

        JOptionPane.showMessageDialog(null, info, "Informações do Arquivo", JOptionPane.INFORMATION_MESSAGE);
    }

    
    private static void protegerArquivo() {
        String nome = solicitarNomeArquivo("Digite o nome do arquivo para tornar SOMENTE LEITURA:");
        if (nome == null) return;

        File arquivo = new File(DIRETORIO, nome);
        if (!validarExistencia(arquivo)) return;

        if (arquivo.setReadOnly()) {
            JOptionPane.showMessageDialog(null, "Arquivo '" + nome + "' definido como SOMENTE LEITURA com sucesso!\n"
                    + "Consulte a opção 6 para verificar a permissão de gravação.", "Desafio Concluído", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível alterar as permissões do arquivo neste Sistema Operacional.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    
    private static void encerrarSistema() {
        JOptionPane.showMessageDialog(null, "Sistema encerrado com sucesso. Até logo!", "Encerramento", JOptionPane.INFORMATION_MESSAGE);
    }

    

    private static String solicitarNomeArquivo(String mensagem) {
        String nome = JOptionPane.showInputDialog(null, mensagem, "Entrada de Dados", JOptionPane.QUESTION_MESSAGE);
        if (nome == null) return null; // Usuário cancelou

        nome = nome.trim();
        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Erro: O nome do arquivo não pode ser vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return nome;
    }

    private static boolean validarExistencia(File arquivo) {
        if (!arquivo.exists()) {
            JOptionPane.showMessageDialog(null, "Erro: O arquivo '" + arquivo.getName() + "' não existe no diretório LABORATORIO!", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}
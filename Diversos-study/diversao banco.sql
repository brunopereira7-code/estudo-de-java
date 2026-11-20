
CREATE DATABASE IF NOT EXISTS biblioteca
CHARACTER SET utf8mb4
COLLATE utf8mb4_unicode_ci;

USE biblioteca;

CREATE TABLE Editora (
    Editora_ID INT AUTO_INCREMENT PRIMARY KEY,
    Nome_Editora VARCHAR(100) NOT NULL,
    Local_Publicacao VARCHAR(100) NOT NULL
);

CREATE TABLE Autor (
    Autor_ID INT AUTO_INCREMENT PRIMARY KEY,
    Nome_Autor VARCHAR(120) NOT NULL
);

CREATE TABLE Livro (
    ISBN CHAR(13) PRIMARY KEY,
    Titulo VARCHAR(200) NOT NULL,
    Ano_Publicacao YEAR NOT NULL,
    Genero VARCHAR(60) NOT NULL,
    Numero_Paginas INT NOT NULL,
    Editora_ID INT NOT NULL,
    FOREIGN KEY (Editora_ID) REFERENCES Editora(Editora_ID)
        ON DELETE RESTRICT ON UPDATE CASCADE,
    CHECK (Numero_Paginas > 0)
);

CREATE TABLE Livro_Autor (
    ISBN CHAR(13) NOT NULL,
    Autor_ID INT NOT NULL,
    PRIMARY KEY (ISBN, Autor_ID),
    FOREIGN KEY (ISBN) REFERENCES Livro(ISBN)
        ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (Autor_ID) REFERENCES Autor(Autor_ID)
        ON DELETE RESTRICT ON UPDATE CASCADE
);

CREATE TABLE Cliente (
    Cliente_ID INT AUTO_INCREMENT PRIMARY KEY,
    Nome_Cliente VARCHAR(120) NOT NULL,
    Endereco VARCHAR(200) NOT NULL,
    Email VARCHAR(150) NOT NULL UNIQUE
);

CREATE TABLE Emprestimo (
    Emprestimo_ID INT AUTO_INCREMENT PRIMARY KEY,
    Data_Emprestimo DATE NOT NULL,
    Data_Devolucao DATE,
    Cliente_ID INT NOT NULL,
    ISBN CHAR(13) NOT NULL,
    FOREIGN KEY (Cliente_ID) REFERENCES Cliente(Cliente_ID)
        ON DELETE RESTRICT ON UPDATE CASCADE,
    FOREIGN KEY (ISBN) REFERENCES Livro(ISBN)
        ON DELETE RESTRICT ON UPDATE CASCADE
);

INSERT INTO Editora (Nome_Editora, Local_Publicacao)
VALUES
('Editora Horizonte', 'Salvador'),
('Editora Saber', 'Sao Paulo'),
('Editora Letras', 'Rio de Janeiro');

INSERT INTO Autor (Nome_Autor)
VALUES
('Ana Martins'),
('Carlos Oliveira'),
('Beatriz Souza'),
('Pedro Almeida'),
('Mariana Costa');

INSERT INTO Livro
(ISBN, Titulo, Ano_Publicacao, Genero, Numero_Paginas, Editora_ID)
VALUES
('9786500000001', 'O Mundo da Programacao', 2021, 'Tecnologia', 320, 1),
('9786500000002', 'A Arte da Leitura', 2019, 'Literatura', 210, 2),
('9786500000003', 'Banco de Dados Pratico', 2022, 'Tecnologia', 280, 1),
('9786500000004', 'Historias do Brasil', 2020, 'Historia', 350, 3),
('9786500000005', 'Jardim das Palavras', 2018, 'Poesia', 150, 2),
('9786500000006', 'Introducao a Ciencia', 2024, 'Ciencia', 240, 3);

INSERT INTO Livro_Autor (ISBN, Autor_ID)
VALUES
('9786500000001', 1),
('9786500000001', 2),
('9786500000002', 3),
('9786500000003', 2),
('9786500000004', 4),
('9786500000005', 5),
('9786500000006', 1);

INSERT INTO Cliente (Nome_Cliente, Endereco, Email)
VALUES
('Lucas Ferreira', 'Rua das Flores, 100', 'lucas@email.com'),
('Julia Santos', 'Avenida Central, 250', 'julia@email.com'),
('Rafael Lima', 'Rua do Sol, 75', 'rafael@email.com'),
('Camila Rocha', 'Avenida Bahia, 400', 'camila@email.com');

INSERT INTO Emprestimo
(Data_Emprestimo, Data_Devolucao, Cliente_ID, ISBN)
VALUES
('2026-10-01', '2026-10-15', 1, '9786500000001'),
('2026-10-05', '2026-10-19', 2, '9786500000003'),
('2026-10-10', NULL, 3, '9786500000002');

SELECT * FROM Livro;

SELECT Titulo, Genero
FROM Livro;

SELECT Nome_Cliente, Email
FROM Cliente;

SELECT *
FROM Livro
WHERE Ano_Publicacao >= 2020;

SELECT Titulo
FROM Livro
ORDER BY Titulo ASC;

SELECT Nome_Autor
FROM Autor;

SELECT *
FROM Editora
WHERE Local_Publicacao = 'Salvador';

SELECT Data_Emprestimo, Data_Devolucao
FROM Emprestimo;

UPDATE Cliente
SET Email = 'lucas.ferreira@email.com'
WHERE Cliente_ID = 1;

SELECT Nome_Cliente, Email
FROM Cliente
WHERE Cliente_ID = 1;

UPDATE Cliente
SET Endereco = 'Rua Nova, 500'
WHERE Cliente_ID = 2;

SELECT Nome_Cliente, Endereco
FROM Cliente
WHERE Cliente_ID = 2;

UPDATE Livro
SET Genero = 'Programacao'
WHERE ISBN = '9786500000001';

SELECT Titulo, Genero
FROM Livro
WHERE ISBN = '9786500000001';

UPDATE Emprestimo
SET Data_Devolucao = '2026-10-20'
WHERE Emprestimo_ID = 1;

SELECT Data_Emprestimo, Data_Devolucao
FROM Emprestimo
WHERE Emprestimo_ID = 1;

INSERT INTO Cliente (Nome_Cliente, Endereco, Email)
VALUES ('Mariana Oliveira', 'Rua das Acacias, 120', 'mariana.oliveira@email.com');

SELECT *
FROM Cliente
WHERE Email = 'mariana.oliveira@email.com';

DELETE FROM Cliente
WHERE Email = 'mariana.oliveira@email.com';

SELECT *
FROM Cliente
WHERE Email = 'mariana.oliveira@email.com';

INSERT INTO Autor (Nome_Autor)
VALUES ('Roberto Mendes');

SELECT *
FROM Autor
WHERE Nome_Autor = 'Roberto Mendes';

DELETE FROM Autor
WHERE Nome_Autor = 'Roberto Mendes';

SELECT *
FROM Autor
WHERE Nome_Autor = 'Roberto Mendes';


SELECT * FROM Editora;
SELECT * FROM Autor;
SELECT * FROM Livro;
SELECT * FROM Livro_Autor;
SELECT * FROM Cliente;
SELECT * FROM Emprestimo;

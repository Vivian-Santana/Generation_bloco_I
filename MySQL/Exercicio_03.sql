CREATE DATABASE registro_escolar;
CREATE TABLE estudantes(
id INT NOT NULL AUTO_INCREMENT,
nome VARCHAR (255),
curso VARCHAR (255),
turma TINYINT (2),
modulo TINYINT (2),
nota DECIMAL (5,1),
PRIMARY KEY (id)
);
INSERT INTO estudantes (nome, curso, turma, modulo, nota)
VALUES ('Marina Rui Barbosa', 'frances', 10, 2, 8.5),
('Letícia Sabatella', 'alemão',7, 1, 7.0),
('Giovanna Antonelli', 'mandarim', 3, 4, 5.5),
('Leandra Leal', 'Italiano', 24 , 1, 10),
('Mateus Solano', 'frances', 10, 2, 7.0),
('Cleber Toledo', 'inglês', 34, 3, 7.5),
('Henry Cavill', 'espanhol', 30, 5, 10),
('Robert Downey Jr.', 'frances', 10, 2, 7.0);
SELECT * FROM estudantes;
SELECT nome, nota FROM estudantes
WHERE nota > 7
ORDER BY nota;
SELECT nome, nota FROM estudantes
WHERE nota < 7
ORDER BY nota

INSERT INTO curso (nome) VALUES ('Engenharia de Software'), ('Ciência da Computação');

INSERT INTO professor (nome, email) VALUES ('Prof. João', 'joao@universidade.com'), ('Prof. Ana', 'ana@universidade.com');

INSERT INTO turma (nome, curso_id, professor_id) VALUES 
('Turma A', 1, 1), 
('Turma B', 2, 2);

INSERT INTO estudante (nome, email, turma_id) VALUES
('Estudante 1', 'estudante1@teste.com', 1),
('Estudante 2', 'estudante2@teste.com', 1),
('Estudante 3', 'estudante3@teste.com', 1),
('Estudante 4', 'estudante4@teste.com', 1),
('Estudante 5', 'estudante5@teste.com', 1),
('Estudante 6', 'estudante6@teste.com', 2),
('Estudante 7', 'estudante7@teste.com', 2),
('Estudante 8', 'estudante8@teste.com', 2),
('Estudante 9', 'estudante9@teste.com', 2),
('Estudante 10', 'estudante10@teste.com', 2);

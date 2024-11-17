INSERT INTO estudante (id, nome, email) VALUES 
(1, 'Ana Silva', 'ana.silva@email.com'),
(2, 'João Santos', 'joao.santos@email.com'),
(3, 'Maria Oliveira', 'maria.oliveira@email.com'),
(4, 'Pedro Costa', 'pedro.costa@email.com'),
(5, 'Paula Souza', 'paula.souza@email.com'),
(6, 'Lucas Pereira', 'lucas.pereira@email.com'),
(7, 'Juliana Mendes', 'juliana.mendes@email.com'),
(8, 'Carla Rocha', 'carla.rocha@email.com'),
(9, 'Ricardo Lima', 'ricardo.lima@email.com'),
(10, 'Fernanda Alves', 'fernanda.alves@email.com');

-- Cursos
INSERT INTO curso (id, nome) VALUES 
(1, 'Engenharia de Software'),
(2, 'Ciência da Computação');

-- Professores
INSERT INTO professor (id, nome, email) VALUES 
(1, 'Prof. Carlos', 'carlos.prof@email.com'),
(2, 'Prof. Helena', 'helena.prof@email.com');

-- Turmas
INSERT INTO turma (id, nome, professor_id, curso_id) VALUES 
(1, 'Turma A', 1, 1),
(2, 'Turma B', 2, 2);

-- Matrículas
INSERT INTO turma_estudante (turma_id, estudante_id) VALUES 
(1, 1), (1, 2), (1, 3), (1, 4), (1, 5),
(2, 6), (2, 7), (2, 8), (2, 9), (2, 10);
-- Inserir dados de teste para a tabela Curso
INSERT INTO curso (nome, descricao) VALUES ('Matemática', 'Curso de Matemática');
INSERT INTO curso (nome, descricao) VALUES ('Fisica', 'Curso de Física');

-- Inserir dados de teste para a tabela Atividade
INSERT INTO atividade (nome, descricao, data, categoria, curso_id, publicada) VALUES ('Atividade 1', 'Descriçao da Atividade 1', '2024-01-01', 'Exercício', 1, false);
INSERT INTO atividade (nome, descricao, data, categoria, curso_id, publicada) VALUES ('Atividade 2', 'Descrição da Atividade 2', '2024-01-15', 'Projeto', 2, true);

-- Inserir dados de teste para a tabela Foto
INSERT INTO foto (url, legenda, atividade_id) VALUES ('http://example.com/foto1.jpg', 'Descrição da Foto 1', 1);
INSERT INTO foto (url, legenda, atividade_id) VALUES ('http://example.com/foto2.jpg', 'Descrição da Foto 2', 2);

-- Inserir Atores
INSERT INTO ATOR (id, nome, data_nascimento, nacionalidade) VALUES (1, 'Tom Hanks', '1956-07-09', 'Americano');
INSERT INTO ATOR (id, nome, data_nascimento, nacionalidade) VALUES (2, 'Leonardo DiCaprio', '1974-11-11', 'Americano');
INSERT INTO ATOR (id, nome, data_nascimento, nacionalidade) VALUES (3, 'Morgan Freeman', '1937-06-01', 'Americano');
INSERT INTO ATOR (id, nome, data_nascimento, nacionalidade) VALUES (4, 'Scarlett Johansson', '1984-11-22', 'Americano');
INSERT INTO ATOR (id, nome, data_nascimento, nacionalidade) VALUES (5, 'Robert Downey Jr.', '1965-04-04', 'Americano');

-- Inserir Diretores
INSERT INTO DIRETOR (id, nome, data_nascimento, nacionalidade) VALUES (1, 'Steven Spielberg', '1946-12-18', 'Americano');
INSERT INTO DIRETOR (id, nome, data_nascimento, nacionalidade) VALUES (2, 'Christopher Nolan', '1970-07-30', 'Britânico');
INSERT INTO DIRETOR (id, nome, data_nascimento, nacionalidade) VALUES (3, 'Quentin Tarantino', '1963-03-27', 'Americano');
INSERT INTO DIRETOR (id, nome, data_nascimento, nacionalidade) VALUES (4, 'Martin Scorsese', '1942-11-17', 'Americano');
INSERT INTO DIRETOR (id, nome, data_nascimento, nacionalidade) VALUES (5, 'James Cameron', '1954-08-16', 'Canadense');

-- Inserir Filmes
INSERT INTO FILME (id, nome, data_lancamento, orcamento, descricao, diretor_id) VALUES (1, 'Forrest Gump', '1994-07-06', 55000000, 'A vida extraordinária de um homem simples', 1);
INSERT INTO FILME (id, nome, data_lancamento, orcamento, descricao, diretor_id) VALUES (2, 'A Origem', '2010-07-16', 160000000, 'Um ladrão que rouba segredos corporativos através do uso da tecnologia de compartilhamento de sonhos', 2);
INSERT INTO FILME (id, nome, data_lancamento, orcamento, descricao, diretor_id) VALUES (3, 'Titanic', '1997-12-19', 200000000, 'Um romance épico e uma história de desastre a bordo do Titanic', 5);
INSERT INTO FILME (id, nome, data_lancamento, orcamento, descricao, diretor_id) VALUES (4, 'Pulp Fiction', '1994-10-14', 8000000, 'As vidas de dois assassinos da máfia, um boxeador e um par de bandidos se entrelaçam', 3);
INSERT INTO FILME (id, nome, data_lancamento, orcamento, descricao, diretor_id) VALUES (5, 'O Lobo de Wall Street', '2013-12-25', 100000000, 'Baseado na história real de Jordan Belfort', 4);

-- Relacionar Filmes com Atores
INSERT INTO FILME_ATORES (filme_id, atores_id) VALUES (1, 1);  -- Forrest Gump - Tom Hanks
INSERT INTO FILME_ATORES (filme_id, atores_id) VALUES (2, 2);  -- A Origem - Leonardo DiCaprio
INSERT INTO FILME_ATORES (filme_id, atores_id) VALUES (3, 2);  -- Titanic - Leonardo DiCaprio
INSERT INTO FILME_ATORES (filme_id, atores_id) VALUES (4, 1);  -- Pulp Fiction - Tom Hanks
INSERT INTO FILME_ATORES (filme_id, atores_id) VALUES (5, 2);  -- O Lobo de Wall Street - Leonardo DiCaprio
INSERT INTO FILME_ATORES (filme_id, atores_id) VALUES (2, 3);  -- A Origem - Morgan Freeman
INSERT INTO FILME_ATORES (filme_id, atores_id) VALUES (3, 4);  -- Titanic - Scarlett Johansson

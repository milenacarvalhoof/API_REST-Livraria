INSERT INTO tb_perfil(id, nome) VALUES('1', 'ADMIN');
INSERT INTO tb_perfil(id, nome) VALUES('2', 'USUARIO');

INSERT INTO tb_usuario(usuario, senha, perfil_id) VALUES('Admin', '$2a$10$hfMhIPDkxVZUuf.ap4e1Su91eBYsm92uHoHd.m3RBTCDEk.wYV0CW', '1');
INSERT INTO tb_usuario(usuario, senha, perfil_id) VALUES('Usuario', '$2a$10$hfMhIPDkxVZUuf.ap4e1Su91eBYsm92uHoHd.m3RBTCDEk.wYV0CW', '2');

INSERT INTO tb_autor(id, nome) VALUES('1', 'Clarice Lispector');
INSERT INTO tb_autor(id, nome) VALUES('2', 'Simone de Beavouir');
INSERT INTO tb_autor(id, nome) VALUES('3', 'Machado de Assis');

INSERT INTO tb_livro(tema, autor_id, qtd_paginas, genero) VALUES('Todos Os Contos', '1', '400', 'Ficção');
INSERT INTO tb_livro(tema, autor_id, qtd_paginas, genero) VALUES('O Segundo Sexo', '2', '300', 'Filosofia');
INSERT INTO tb_livro(tema, autor_id, qtd_paginas, genero) VALUES('Dom Casmurro', '3', '500', 'Romance, Ficção, Memórias, Realismo Literário');
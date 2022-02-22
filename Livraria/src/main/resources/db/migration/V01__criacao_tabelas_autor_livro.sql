CREATE TABLE tb_autor(
id BIGINT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(255) NOT NULL
);

CREATE TABLE tb_livro(
id BIGINT AUTO_INCREMENT PRIMARY KEY,
tema VARCHAR(255) NOT NULL,
autor_id BIGINT NOT NULL,
qtd_paginas INT NOT NULL,
FOREIGN KEY (autor_id) REFERENCES tb_autor(id)
);
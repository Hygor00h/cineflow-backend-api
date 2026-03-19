CREATE TABLE generos(
    id SERIAL PRIMARY KEY,
    nome VARCHAR(50) NOT NULL
);

CREATE TABLE filmes(
    id SERIAL PRIMARY KEY,
    titulo VARCHAR(150) NOT NULL,
    duracao INTEGER NOT NULL,
    genero_id INTEGER REFERENCES generos(id)
);

INSERT INTO generos (nome) VALUES ('Ação'),('Drama');

INSERT INTO filmes (titulo, duracao, genero_id)
VALUES('O Exterminador do Futuro' 2, 2, 1);

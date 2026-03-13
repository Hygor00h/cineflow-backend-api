CREATE TABLE roles(
    id SERIAL PRIMARY KEY,
    nome VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE usuarios(
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    senha VARCHAR(100) NOT NULL,
    role_id INTEGER REFERENCES roles(id)
);

INSERT INTO roles (nome) VALUES ('ROLE_ADMIN');
INSERT INTO roles (nome) VALUES ('ROLE_CLIENTE');

INSERT INTO usuarios (nome, email, senha, role_id)
VALUES ('Hygor Admin', 'admin@cineflow.com','$2a$10$8.UnVuG9HHgffUDAlk8qnO6p5E6XG6GExB75.O.G4qUghjI3.J7I2',1);
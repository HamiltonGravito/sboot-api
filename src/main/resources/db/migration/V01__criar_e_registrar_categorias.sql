CREATE SEQUENCE categoria_seq START 1 INCREMENT 1;
CREATE TABLE categoria(
    codigo BIGINT PRIMARY KEY DEFAULT nextval('categoria_seq') NOT NULL,
    nome VARCHAR(50) NOT NULL
);

INSERT INTO categoria (nome) VALUES ('Lazer');
INSERT INTO categoria (nome) VALUES ('Alimentação');
INSERT INTO categoria (nome) VALUES ('Supermercado');
INSERT INTO categoria (nome) VALUES ('Farm[acia');
INSERT INTO categoria (nome) VALUES ('Outros');


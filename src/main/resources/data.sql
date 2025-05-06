CREATE TABLE consumo_mensal (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    mes VARCHAR(255),
    consumo INT
);
CREATE TABLE dispositivo (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    tipo VARCHAR(255),
    ativo BOOLEAN
);

CREATE TABLE usuario (
    id BIGINT PRIMARY KEY,
    nome VARCHAR(255),
    email VARCHAR(255)
);


INSERT INTO consumo_mensal (mes, consumo) VALUES
('Janeiro', 150),
('Fevereiro', 120),
('Março', 180),
('Abril', 200),
('Maio', 170),
('Junho', 190),
('Julho', 210),
('Agosto', 230),
('Setembro', 250),
('Outubro', 220),
('Novembro', 240),
('Dezembro', 260);

INSERT INTO dispositivo (nome, tipo, ativo) VALUES
('Ar-condicionado', 'Eletrodoméstico', true),
('Lâmpada LED', 'Iluminação', true),
('Computador', 'Eletrônico', false),
('Geladeira', 'Eletrodoméstico', true),
('Micro-ondas', 'Eletrodoméstico', false),
('TV LED', 'Eletrônico', true),
('Ventilador', 'Eletrodoméstico', true),
('Roteador', 'Tecnologia', true),
('Cafeteira', 'Eletrodoméstico', true),
('Impressora', 'Tecnologia', false);

INSERT INTO usuario (id, nome, email) VALUES
(1, 'Carlos Silva', 'carlos.silva@email.com'),
(2, 'Maria Oliveira', 'maria.oliveira@email.com'),
(3, 'João Pereira', 'joao.pereira@email.com'),
(4, 'Ana Santos', 'ana.santos@email.com'),
(5, 'Ricardo Almeida', 'ricardo.almeida@email.com'),
(6, 'Fernanda Costa', 'fernanda.costa@email.com'),
(7, 'Lucas Martins', 'lucas.martins@email.com'),
(8, 'Patrícia Lima', 'patricia.lima@email.com'),
(9, 'Eduardo Souza', 'eduardo.souza@email.com'),
(10, 'Beatriz Rocha', 'beatriz.rocha@email.com');

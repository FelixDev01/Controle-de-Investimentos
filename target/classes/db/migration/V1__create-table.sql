CREATE TABLE investimentos_tb(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome varchar(20) NOT NULL,
    tipo varchar(20) NOT NULL,
    valor_unidade DECIMAL(10,2) NOT NULL,
    quantidade_ativo DECIMAL(10,4) NOT NULL,
    dia_compra DATE NOT NULL
);
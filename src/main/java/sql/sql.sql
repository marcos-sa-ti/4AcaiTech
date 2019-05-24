CREATE DATABASE ecommerceacaitech;

USE ecommerceacaitech;

CREATE TABLE cliente
(
id BIGINT NOT NULL auto_increment,		
nome VARCHAR(100) NOT NULL,
cpf varchar (11) NOT NULL,
datanascimento timestamp (06) NOT NULL,
telefone VARCHAR(10) NOT NULL,
email VARCHAR (50) NOT NULL,
senha VARCHAR (25) NOT NULL,
endereco VARCHAR (100) NOT NULL,
numeroend varchar (20) NOT NULL,
complemento VARCHAR (50),
cep varchar (08) NOT NULL,
cidade varchar (15) NOT NULL,
estado VARCHAR (02) NOT NULL,
nometitular VARCHAR (50),
numerocartao VARCHAR (10),
codigoseg VARCHAR (03),
CONSTRAINT pk_tbcliente PRIMARY KEY(id)
);


CREATE TABLE produto
(
id BIGINT NOT NULL auto_increment,
nome VARCHAR(100) NOT NULL,
descricao varchar(50) NOT NULL,
precovenda int DEFAULT 0 ,
precocompra int DEFAULT 0,
quantidade int,
imagem longblob,
primary key (id)
);
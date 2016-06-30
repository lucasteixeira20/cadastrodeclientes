CREATE TABLE Clientes(
id INTEGER IDENTITY PRIMARY KEY,
nome varchar(30) not null,
telefone  varchar(30) not null,
email varchar(30)  not null
)

CREATE TABLE ClienteFisico(
CodigoCliente integer not null,
cpf varchar(30) not null,
FOREIGN KEY(CodigoCliente) REFERENCES Clientes(id)
)

CREATE TABLE ClienteJuridico(
CodigoCliente integer not null,
cnpj varchar(30) not null,
FOREIGN KEY(CodigoCliente) REFERENCES Clientes(id)
)

CREATE TABLE Produto(
EAN varchar(30) PRIMARY KEY,
nome varchar(30) not null,
valor float not null,
quantidade varchar(30) not null
)

CREATE TABLE Login(
login varchar(30) PRIMARY KEY,
senha varchar(30) not null
)



insert into ClienteFisico(cpf)
values(884111441)

insert into ClienteFisico(cpf)
values(884111441)

insert into login(login,senha)
values('Eder','123')

select * from ClientesFisico

insert into Clientes(nome, telefone, email)
values('eder','1231456','jioasd@54dfmkj')
;
commit
;


select * from Clientes


;

update Clientes
set email= 'Avenida@jklsdsd.com'
where nome = 'eder'
commit
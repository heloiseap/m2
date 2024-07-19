-- Database: trello

-- DROP DATABASE IF EXISTS trello;

CREATE DATABASE trello
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Portuguese_Brazil.1252'
    LC_CTYPE = 'Portuguese_Brazil.1252'
    LOCALE_PROVIDER = 'libc'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;

-- Criacao de entidades

CREATE TABLE Nutricionista (
	id serial PRIMARY KEY,
	crn varchar(20) NOT NULL,
	especialidade varchar(20) NOT NULL,
	tempo_exp int NOT NULL	
)
	
CREATE TABLE Paciente (
	id serial PRIMARY KEY,
	nome varchar(50) NOT NULL,
	data_nascimento date NOT NULL,
	cpf varchar(20) NOT NULL,
	telefone varchar(16) NOT NULL,
	email varchar(50) NOT NULL
)

CREATE TABLE Consulta (
	id serial PRIMARY KEY,
	id_paciente int NOT NULL REFERENCES Paciente(id),
	id_nutri int NOT NULL REFERENCES Nutricionista(id),
	data_consulta date NOT NULL,
	observacoes text NOT NULL
)

-- Insercao de dados nas tabelas

INSERT INTO Paciente (nome, data_nascimento, cpf, telefone, email)
VALUES
('João Silva','1999-01-25', '012.345.678-90', '(11)99999-8888', 'joaosilva233@email.com'),
('Maria Ribeiro', '1966-07-13', '14536598764', '+55(51)987456321', 'maria_ribeiro_@gmail.com'),
('Valdemir Rocha', '1944-05-09', '987.654.321-66', '(48) 988856666', 'valdemirRocha@hotmail.com'),
('Marco Santos','2000-01-27', '210.345.678-09', '(22)98887-1234', 'marco_santos_2000@gmail.com');

INSERT INTO Nutricionista (crn, especialidade, tempo_exp)
VALUES
('CRN-5/1234', 'Atletas','5'),
('CRN-5/9874/S', 'Vegetarianismo', '1'),
('CRN-5/5555', 'Clinica', '3'),
('CRN-5/9854', 'Idosos','13');

INSERT INTO Consulta (id_paciente, id_nutri, data_consulta, observacoes)
VALUES 
    ((SELECT id FROM Paciente WHERE id='2'), (SELECT id FROM Nutricionista WHERE id='3'), '2024-05-30', 'Paciente obeso'),
    ((SELECT id FROM Paciente WHERE id='1'), (SELECT id FROM Nutricionista WHERE id='1'), '2022-10-01', 'Pós cirurgico'),
    ((SELECT id FROM Paciente WHERE id='3'), (SELECT id FROM Nutricionista WHERE id='2'), '2024-05-30', 'Paciente quer ganhar massa muscular');

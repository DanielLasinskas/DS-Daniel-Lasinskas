-- Criar o banco de dados se ainda não existir
CREATE DATABASE IF NOT EXISTS fat;

-- Usar o banco de dados
USE fat;

-- Criar a tabela 'alunos'
CREATE TABLE IF NOT EXISTS alunos (
    codigo_aluno VARCHAR(10) PRIMARY KEY,
    nome_aluno VARCHAR(100) NOT NULL
);

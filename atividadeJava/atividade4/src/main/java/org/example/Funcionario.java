package org.example;

public class Funcionario extends Pessoa {

    private String matricula;
    public Funcionario(String nome, String cpf, Endereco endereco, String matricula) {
        super(nome, cpf, endereco);
        this.matricula = matricula;
    }
}

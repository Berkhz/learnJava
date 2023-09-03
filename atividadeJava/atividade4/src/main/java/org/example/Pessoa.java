package org.example;

public class Pessoa {

    private String nome;
    private String cpf;
    private Endereco endereco;

    public Pessoa(String nome, String cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCpfFormatado() {
        Formatador formatador = new Formatador();
        setCpf(formatador.formatarCpf(getCpf()));
    }
}

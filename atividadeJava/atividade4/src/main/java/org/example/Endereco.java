package org.example;

public class Endereco {

    private String logradouro;
    private String numero;

    public Endereco(String logradouro, String numero) {
        this.logradouro = logradouro;
        this.numero = numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }
}

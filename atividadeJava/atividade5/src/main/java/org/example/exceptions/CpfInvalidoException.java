package org.example.exceptions;

public class CpfInvalidoException extends Exception {

    public CpfInvalidoException() {
        super("CPF não possui a quantidade esperado de caracteres!");
    }
}

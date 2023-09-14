package org.example.exceptions;

public class CpfInvalidoException extends Exception {

    public CpfInvalidoException() {
        super("CPF não possui 11 caracteres!");
    }
}

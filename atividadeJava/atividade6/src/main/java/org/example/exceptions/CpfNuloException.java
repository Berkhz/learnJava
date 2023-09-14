package org.example.exceptions;

public class CpfNuloException extends Exception {

    public CpfNuloException() {
        super("CPF não deve ser nulo");
    }
}

package org.example.exceptions;

public class CpfNullException extends Exception {

    public CpfNullException() {
        super("O valor não pode ser null");
    }
}

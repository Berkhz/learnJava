package br.edu.unicesumar.crud.exceptions;

public class PessoaException extends Exception {

    public PessoaException(){
        super("0 id não foi encontrado");
    }
}

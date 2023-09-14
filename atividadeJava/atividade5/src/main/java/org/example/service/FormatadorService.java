package org.example.service;

import org.example.exceptions.CpfInvalidoException;
import org.example.exceptions.CpfNullException;

public class FormatadorService {

    public String formatarCpf(String cpf) throws Exception {

        if (cpf == null) {
            throw new CpfNullException();
        }

        String cpfFormatado = cpf.replaceAll("\\.|\\-", "");

        if(cpfFormatado.length() != 11) {
            throw new CpfInvalidoException();
        }

        return cpfFormatado;
    }
}

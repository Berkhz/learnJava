package org.example.service;

import org.example.exceptions.CpfInvalidoException;
import org.example.exceptions.CpfNuloException;

public class FormatadorService {

    public String formatarCpf(String cpf) throws CpfInvalidoException, CpfNuloException {

        if (cpf == null)
            throw new CpfNuloException();

        String cpfFormatado = cpf.replaceAll(
                "\\.|\\-", "");

        if (cpfFormatado.length() != 11)
            throw new CpfInvalidoException();
        else
            return cpfFormatado;
    }
}

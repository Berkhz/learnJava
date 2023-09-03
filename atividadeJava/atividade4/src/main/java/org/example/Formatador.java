package org.example;

public class Formatador {
    public String formatarCpf(String cpf) {

        String cpfFormatado =
                cpf.replaceAll("\\.|\\-", "");

        if (cpfFormatado.length() == 11) {
            return cpfFormatado;
        }

        return "Erro!";
    }
}

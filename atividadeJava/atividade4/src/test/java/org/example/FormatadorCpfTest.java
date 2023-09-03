package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FormatadorCpfTest {

    // verificar se tem 11 caracteres
    // remover pontos e hifen

    // 000.000.000-00
    // 000.000.000-0

    @Test
    public void verificaCpfValido() {
        Endereco endereco = new Endereco(
                "Av.Unicesumar", "12B"
        );

        Funcionario gargamel = new Funcionario("Gargamel",
                "133.021.539-70",
                endereco,
                "123-A");

        gargamel.setCpfFormatado();

        String resultado = gargamel.getCpf();

        Assertions.assertEquals("13302153970", resultado);
    }

    @Test
    public void verificaCpfInvalido() {
        Endereco endereco = new Endereco(
                "Av.Unicesumar", "12B"
        );

        Funcionario gargamel = new Funcionario("Gargamel",
                "133.021.539-7",
                endereco,
                "123-A");

        gargamel.setCpfFormatado();

        String resultado = gargamel.getCpf();

        Assertions.assertEquals("Erro!", resultado);
    }
}

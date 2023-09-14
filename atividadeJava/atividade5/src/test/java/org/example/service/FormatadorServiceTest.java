package org.example.service;

import org.example.exceptions.CpfInvalidoException;
import org.example.exceptions.CpfNullException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FormatadorServiceTest {

    @Test
    public void formataCpfValido() throws Exception, CpfNullException, CpfInvalidoException {

        FormatadorService service = new FormatadorService();

        String resultado = service.formatarCpf("123.123.123-88");

        Assertions.assertEquals("12312312388", resultado);
    }

    @Test
    public void formataCpfInvalido() throws Exception, CpfNullException, CpfInvalidoException {

        FormatadorService service = new FormatadorService();

        Exception resultado = Assertions.assertThrows(Exception.class,
                () -> service.formatarCpf("123.123.123-8"));

        Assertions.assertEquals("CPF não possui a quantidade esperado de caracteres!" ,resultado.getMessage());
    }

    @Test
    public void formataCpfNulo() throws Exception, CpfNullException, CpfInvalidoException {

        FormatadorService service = new FormatadorService();

        Exception resultado = Assertions.assertThrows(CpfNullException.class,
                () -> service.formatarCpf(null));

        Assertions.assertEquals("O valor não pode ser null" ,resultado.getMessage());
    }
}
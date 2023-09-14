package org.example.service;

import org.example.exceptions.CpfInvalidoException;
import org.example.exceptions.CpfNuloException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FormatadorServiceTest {

    @Test
    public void deveRemoverHifenEPontosDoCpf() throws Exception {

        FormatadorService service = new FormatadorService();

        try {
            String resultado = service.formatarCpf("123.213.123-88");
            Assertions.assertEquals("12321312388", resultado);

            System.out.println("Executou o try");
        } catch (CpfInvalidoException | CpfNuloException ex) {
            System.out.println("Executou o catch");
        }

    }

    @Test
    public void naoDeveRemoverHifenEPontosDoCpf() throws Exception {

        FormatadorService service = new FormatadorService();

        try {
            String resultado = service.formatarCpf("1233.213.123-88");
            Assertions.assertEquals("12321312388", resultado);

            System.out.println("Executou o try");
        } catch (CpfInvalidoException | CpfNuloException ex) {
            System.out.println("Executou o catch");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("2° bloco catch");
        }
        finally {
            System.out.println("Fim");
        }

    }
}

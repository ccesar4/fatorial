package br.com.uff.students.csilva.fatorial;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

/**
 * Classe de teste para a classe Fatorial
 * Parei de executar os testes apos testar os valores padrões e a exceção que o método pode lançar, para tentar cobrir
 * a maior parte do código.
 */
@RunWith(MockitoJUnitRunner.class)
public class FatorialTest {
        private Fatorial fatorial;

    /**
     * Método para verificar se o cálculo do fatorial está correto.
     */
    @Test
    public void fatorialDeZeroDeveSerUm() throws Exception {
        int esperado = 1;
        fatorial = new Fatorial();

        assertEquals(esperado, fatorial.fatorial(0));
    }

    /**
     * Método para verificar se o cálculo do fatorial está correto.
     */
    @Test
    public void fatorialDeUmDeveSerUm() throws Exception {
        int esperado = 1;
        fatorial = new Fatorial();

        assertEquals(esperado, fatorial.fatorial(1));
    }

    /**
     * Método para verificar se o cálculo do fatorial está correto.
     */
    @Test(expected = Exception.class)
    public void fatorialDeNumeroNegativoDeveJogarExceção() throws Exception {
        fatorial = new Fatorial();
        fatorial.fatorial(-1);
//        assertThrows(Exception.class, () -> fatorial.fatorial(-1));//

    }
}
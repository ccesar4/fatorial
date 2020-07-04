package br.com.uff.students.csilva.fatorial;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FatorialTest {
        private Fatorial fatorial;

    @Test
    public void fatorialDeveSerVerdadeiro() {
        int esperado = 720;
        fatorial = new Fatorial();

        assertEquals(esperado, fatorial.fatorial(6));
    }
}
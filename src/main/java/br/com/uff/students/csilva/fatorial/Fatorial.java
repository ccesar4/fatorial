package br.com.uff.students.csilva.fatorial;

/**
 * Classe Fatorial
 */
public class Fatorial {

    /**
     * Método para calcular fatorial
     * @param numero número para cálculo do fatorial.
     * @return resultado do fatorial.
     */
    public int fatorial(int numero) throws Exception {
        int fact = 1;
        if (numero > 0){
            for (int i = 1; i<= numero; i++){
                fact *= i;
            }
        }else{
            throw new Exception();
        }

        return fact;
    }
}

package br.com.uff.students.csilva.fatorial;

public class Fatorial {

    public int fatorial(int numero){
        int fact = 1;
        for (int i = 1; i<= numero; i++){
            fact *= i;
        }
        return fact;
    }
}

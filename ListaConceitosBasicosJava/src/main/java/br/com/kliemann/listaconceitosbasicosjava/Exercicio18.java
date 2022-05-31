package br.com.kliemann.listaconceitosbasicosjava;

public class Exercicio18 {
    
    public static void main(String[] args) {
        
        /*
        Crie uma exercício que calcule a série de Fibonacci.
        */
        
        int num1 = 1, num2 = 0;
        
        System.out.println(num2);
        System.out.println(num1);
        
        for(int i = 0; i < 11; i++) {
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.println(num1);
        }
        
    }
    
}

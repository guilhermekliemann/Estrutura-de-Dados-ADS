package br.com.kliemann.listaconceitosbasicosjava;

import java.util.Scanner;

public class Exercicio18 {
    
    public static void main(String[] args) {
        
        /*
        Crie uma função que calcule a série de Fibonacci. Use recursividade.
        */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num = sc.nextInt();
        
        System.out.println("\nSerie Fibonacci com " + num + " termos!");
        for(int i=1; i<=num; i++) {
            System.out.println(calcFibonacci(i));
        }
        
    }
    
    public static int calcFibonacci(int x) {
        
        if(x == 1 || x == 2) {
            return 1;
        } else {
            return calcFibonacci(x - 1) + calcFibonacci(x - 2);
        }
        
    }
    
}

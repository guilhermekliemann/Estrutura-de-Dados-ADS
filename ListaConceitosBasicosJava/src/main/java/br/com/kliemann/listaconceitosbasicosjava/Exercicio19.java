package br.com.kliemann.listaconceitosbasicosjava;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        
        /*
        Crie uma função que calcule o fatorial de um número informado pelo usuário. Use recursividade.
        */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int x = sc.nextInt();
        
        System.out.println("Resultado do fatorial de " + x + " é: " + calcFatorial(x));
        
    }
    
    public static int calcFatorial(int x) {
        
        if(x == 0) {
            return 1;
        }
        return x * calcFatorial(x - 1);
        
    }
    
}

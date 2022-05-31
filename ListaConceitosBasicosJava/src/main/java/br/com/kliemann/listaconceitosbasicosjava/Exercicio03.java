package br.com.kliemann.listaconceitosbasicosjava;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        
        /*
        Crie uma função que verifique se um número é par ou impar. Depois implemente um laço que peça ao 
        usuário um número e exiba na tela se ele é par ou impar enquanto ele não digitar 0 (use o mod). 
        */
        
        Scanner sc = new Scanner(System.in);
        
        int num = -1;
        
        while(num != 0) {
            System.out.println("Digite um número para verificar se ele é PAR ou IMPAR: ");
            num = sc.nextInt();
            verificaNumero(num);
        }
        
    }
    
    private static void verificaNumero(int num) {

        if(num % 2 == 0 && num > 0) {
            System.out.println("Esse número é PAR!\n");
        } else if(num > 0){
            System.out.println("Esse número é IMPAR!\n");
        } else {
            System.out.println("Você encerrou o programa!");
        }

    }
    
}

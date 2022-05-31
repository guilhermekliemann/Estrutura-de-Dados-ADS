package br.com.kliemann.listaconceitosbasicosjava;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        
        /*
        Faça um algoritmo que peça dois números inteiros ao usuário. Crie uma função que compara dois números e 
        retorna se o primeiro é maior, menor ou igual ao segundo. 
        */
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o 1º número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o 2º número: ");
        int num2 = sc.nextInt();
        
        if(num1 > num2) {
            System.out.println("O 1º número é maior que o 2º!");
        } else if(num1 < num2) {
            System.out.println("O 2º número é maior que o 1º!");
        } else if(num1 == num2) {
            System.out.println("O números são iguais!");
        }
        
    }
    
}

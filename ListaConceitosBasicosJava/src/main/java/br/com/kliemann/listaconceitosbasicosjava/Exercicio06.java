package br.com.kliemann.listaconceitosbasicosjava;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        
        /*
        Escreva um algoritmo que leia o código e o nome de um produto e mostre sua classificação e tempo de 
        validade. Utilize a seguinte tabela como referência (use o escolha): <tabela>.
        */
        
        Scanner sc = new Scanner(System.in);    
        
        System.out.println("Digite o codigo do produto: (sair = 0)");
        int num = -1;
        
        while(num != 0) {
            num = sc.nextInt();
            switch(num) {
                case 1:
                    System.out.println("ALIMENTO NÃO PERICÍVEL\n"
                                       + "Tempo de validade: indeterminado\n");
                    break;
                case 2,3,4:
                    System.out.println("ALIMENTO PERICÍVEL\n"
                                      + "Tempo de validade: 6 meses\n");
                    break;
                case 5,6:
                    System.out.println("VESTUÁRIO\n"
                                      + "Tempo de validade: indeterminado\n");
                    break;
                case 7:
                    System.out.println("HIGIENE PESSOAL\n"
                                      + "Tempo de validade: 12 meses\n");
                    break;
                case 8,9,10,11,12,13,14,15:
                    System.out.println("LIMPEZA E UTENSÍLIOS DOMÉSTICOS\n"
                                      + "Tempo de validade: indeterminado\n");
                    break;
                default:
                    System.out.println("CÓDIGO INVÁLIDO\n");
            }
        }
        
    }
    
}

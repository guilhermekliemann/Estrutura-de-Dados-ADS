package br.com.kliemann.listaconceitosbasicosjava;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        
        /*
        Elabore um algoritmo que tenha dois vetores de 10 posições com números quaisquer (V1 e V2). Peça ao 
        usuário os dez operadores aritméticos e armazene num terceiro vetor (V3). Escreva o resultado da operação 
        do primeiro vetor, a operação aritmética e o valor da posição no segundo vetor. Por fim, imprima o 
        resultado em tela.
        */
        
        Scanner sc = new Scanner(System.in);
        
        double[] V1 = {5,8,23,65,24,12,3,17,35,43};
        double[] V2 = {8,7,22,76,48,19,55,31,87,14};
        String[] V3 = new String[10];
        double result;
        
        System.out.println("Digite 10 operadores aritméticos para calcular os valores dos vetores, para cada "
                         + "operador digitado será exibido o calculo:\n");
        
        for(int i=0; i<10; i++) {
            V3[i] = sc.next();
            if(V3[i].equals("+")) {
                result = V1[i] + V2[i];
                System.out.println("Resultado da soma de: " + String.format("%.0f",V1[i]) + " + " + 
                                   String.format("%.0f",V2[i]) + " = " + String.format("%.0f",result) + "\n");
            } else if(V3[i].equals("-")) {
                result = V1[i] - V2[i];
                System.out.println("Resultado da subtração de: " + String.format("%.0f",V1[i]) + " - " + 
                                   String.format("%.0f",V2[i]) + " = " + String.format("%.0f",result) + "\n");
            } else if(V3[i].equals("*")) {
                result = V1[i] * V2[i];
                System.out.println("Resultado da multiplicação de: " + String.format("%.0f",V1[i]) + " * " + 
                                   String.format("%.0f",V2[i]) + " = " + String.format("%.0f",result) + "\n");
            } else if(V3[i].equals("/")) {
                result = V1[i] / V2[i];
                System.out.println("Resultado da divisão de: " + String.format("%.0f",V1[i]) + " / " + 
                                   String.format("%.0f",V2[i]) + " = " + result + "\n");
            } else {
                System.out.println("Operador aritmético indisponível!\n");
            }
        }
        
    }
    
}

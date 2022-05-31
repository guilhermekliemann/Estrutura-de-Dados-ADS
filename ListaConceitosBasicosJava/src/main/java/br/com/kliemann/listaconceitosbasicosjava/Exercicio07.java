package br.com.kliemann.listaconceitosbasicosjava;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        
        /*
        O IMC - Índice de Massa corporal é um critério da Organização Mundial da Saúde para dar uma indicação 
        sobre a condição de peso de uma pessoa adulta. A fórmula é IMC = peso / altura². Elabore um algoritmo 
        que leia o peso e a altura de um adulto e mostre sua condição conforme a tabela abaixo: <tabela>.
        */
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual o seu peso?");
        double peso = sc.nextDouble();
        System.out.println("Qual a sua altura?");
        double altura = sc.nextDouble();
        
        double imc = peso / Math.pow(altura,2);
        
        if(imc < 18.5) {
            System.out.println("\nO seu IMC é de " + String.format("%.1f",imc) + " e você está abaixo do peso");
        } else if(imc > 18.5 && imc < 25) {
            System.out.println("\nO seu IMC é de " + String.format("%.1f",imc) + " e você está com o peso normal");
        } else if(imc > 25 && imc < 30) {
            System.out.println("\nO seu IMC é de " + String.format("%.1f",imc) + " e você está acima do peso");
        } else if(imc > 30) {
            System.out.println("\nO seu IMC é de " + String.format("%.1f",imc) + " e você está obeso");
        }
        
    }
    
}

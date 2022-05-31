package br.com.kliemann.listaconceitosbasicosjava;

import java.util.Random;

public class Exercicio14 {

    public static void main(String[] args) {
        
        /*
        Crie um vetor de 200 posições e preencha-o com valores aleatórios de 1 a 500. Depois exiba a soma dos 
        valores, quantos valores são pares e quantos são ímpares. 
        */
        
        Random random = new Random();
        
        int[] x = new int[200];
        
        for(int i=0; i<x.length; i++) {
            x[i] = random.nextInt(500);
        }
        
        for(int j=0; j<x.length; j++) {
            if(x[j] % 2 == 0 && x[j] > 0) {
                System.out.println(x[j] + " é PAR\n");
            } else if(x[j] > 0) {
                System.out.println(x[j] + " é IMPAR\n");
            }
        }
        
        
        
    }
    
}

package br.com.kliemann.listaconceitosbasicosjava;

import java.util.Random;
import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        
        /*
        Crie um vetor de 100 elementos e preencha-o com número aleatórios de 1 a 100. Depois peça ao usuário 
        um valor e verifique se ele está no vetor ou não. Caso esteja, exiba a mensagem “ACERTOU! Valor 
        encontrado.”. Caso não, exiba “NÃO FOI DESTA VEZ! Valor não encontrado”. Continue pedindo um valor 
        e exibindo o resultado até que o usuário informe 0.
        */
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        int[] x = new int[100];
        for(int i=0; i<x.length; i++) {
            x[i] = random.nextInt(100);
        }
        
        int num = -1;
        
        while(num != 0) {
            System.out.println("Digite um número entre 1 e 100 para verificar se está no vetor(sair = 0):");
            num = sc.nextInt();
            
            System.out.println(verificaNumero(x, num));
        }
        
    }
    
    private static String verificaNumero(int[] x, int num) {
        
        String retorno = "Número não encontrado!\n";
        
        for(int i=0; i<x.length; i++) {
            if(x[i] == num) {
                retorno = "Número " + x[i] + " encontrado na posição - " + i + "!\n";
            }
        }
        return retorno;
        
    }
    
}

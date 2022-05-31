package br.com.kliemann.listaquicksort;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        
        int[] x = new int[10];
        
        int[] aux = new int[x.length];
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < x.length; i++) {
            System.out.println("Digite o " + (i+1) + "° valor do vetor:");
            x[i] = sc.nextInt();
        }
       
        quickSort(x, 0, x.length-1);
        System.out.println("\nVetor ordenado crescente: " + Arrays.toString(x));         
        
    }
    
    private static void quickSort(int[] x, int inicio, int fim) {
        int posicao_pivo;
        
        if(inicio < fim) {
            posicao_pivo = particao(x, inicio, fim);
            quickSort(x,inicio, posicao_pivo - 1);
            quickSort(x, posicao_pivo + 1, fim);
        }  
    }
    
    private static int particao(int[] x, int inicio, int fim) {
        int pivo, i, j;
        
        pivo = x[inicio];
        i = inicio + 1;
        j = fim;
        
        while(i <= j) {
            if(x[i] <= pivo) {
                i++;
            }else if(pivo < x[j]) {
                j--;
            }else {
                troca(x, i, j);
                i++;
                j--;
            }
        }
        x[inicio] = x[j];
        x[j] = pivo;
        
        return j;
    }
    
    public static void troca(int[] x, int i, int j) {
        int aux;       
        aux = x[i];
        x[i] = x[j];
        x[j] = aux; 
    }
}

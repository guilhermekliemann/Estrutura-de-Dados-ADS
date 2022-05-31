package br.com.kliemann.listaquicksort;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Random;

public class Exercicio04c {

    //Quick Sort
    public static void main(String[] args) {
        
        Duration duration = Duration.between(LocalTime.NOON, LocalTime.MAX);
        
        LocalTime tempoInicial = LocalTime.now();
        System.out.println("\nTempo inicial: " + tempoInicial + "\n");
        
        Random random = new Random();
        
        int[] x = new int[20000];
        for (int i=0; i<x.length; i++) {
                 x[i] = random.nextInt(20000);
                 System.out.println(x[i]);
            }
        
        int[] aux = new int[x.length];

        quickSort(x, 0, x.length-1);
        System.out.println(Arrays.toString(x));
        
        LocalTime tempoFinal = LocalTime.now();
        System.out.println("\nTempo final: " + tempoFinal);
        
        Duration diff = duration.between(tempoInicial, tempoFinal);
        long tempoTotal = diff.toMillis();
        System.out.println("\nTempo total de execução: " + tempoTotal + "\n");
        
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

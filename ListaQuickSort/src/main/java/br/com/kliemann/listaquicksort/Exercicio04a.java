package br.com.kliemann.listaquicksort;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Random;

public class Exercicio04a {

    //Bubble Sort
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
        
        int y[];
        x = bubble_sort_cres(x);
        System.out.println(Arrays.toString(x));
        
        LocalTime tempoFinal = LocalTime.now();
        System.out.println("\nTempo final: " + tempoFinal);
        
        Duration diff = duration.between(tempoInicial, tempoFinal);
        long tempoTotal = diff.toMillis();
        System.out.println("\nTempo total de execução: " + tempoTotal + "\n");
        
    }
 
    public static int[] bubble_sort_cres(int[] y) {
        int aux = 0;

        for (int i = 1; i < y.length; i++) {
            for (int j = 0; j < y.length - 1; j++) {
                if (y[j] > y[j + 1]) {
                    aux = y[j];
                    y[j] = y[j + 1];
                    y[j + 1] = aux;
                }
            }
        }
        return y;
    }    
}

package br.com.kliemann.listabubblesort;

import static br.com.kliemann.listabubblesort.Exercicio01.bubble_sort_cres;
import java.util.Arrays;

public class Exercicio02 {

    public static void main(String[] args) {
        
        int x[] = {5,8,3,4,6,1};
        
        System.out.println("\nVetor original: " + Arrays.toString(x));
        
        bubble_sort_desc(x);
        
        System.out.println("\nVetor ordenado decrescente: " + Arrays.toString(x) + "\n");
        
        
    }
    
    public static int[] bubble_sort_desc(int[] x) {
        int aux = 0;

        for (int i = 1; i < x.length; i++) {
            for (int j = 0; j < x.length - 1; j++) {
                if (x[j] < x[j + 1]) {
                    aux = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = aux;
                }
            }
        }        
        return x;
    }
}

package br.com.kliemann.metodosdeordenacao;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        
       int x[] = {5,8,3,4,6,1};
        
        System.out.println("\nVetor original: " + Arrays.toString(x));
        
        bubble_sort_cres(x);
        
        System.out.println("\nVetor ordenado crescente: " + Arrays.toString(x) + "\n");
        
    }
    
    public static int[] bubble_sort_cres(int[] x) {
        int aux = 0;

        for (int i = 1; i < x.length; i++) {
            for (int j = 0; j < x.length - 1; j++) {
                if (x[j] > x[j + 1]) {
                    aux = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = aux;
                }
            }
        }
        return x;
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

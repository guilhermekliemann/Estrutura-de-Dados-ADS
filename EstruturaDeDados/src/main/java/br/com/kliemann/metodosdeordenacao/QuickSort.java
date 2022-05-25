package br.com.kliemann.metodosdeordenacao;

public class QuickSort {

    public static void main(String[] args) {
        
        int[] x = {8,5,4,9,3,7,6,1,2};
        
        System.out.println("Vetor original: ");
        for(int i=0; i<x.length; i++) {
            System.out.println(x[i] + "-");
        }
        
        quickSort(x, 0, x.length-1);
        
        System.out.println("\nVetor ordenado: ");
        for(int i=0; i<x.length; i++) {
            System.out.println(x[i] + "-");
        }
        System.out.println("");
        
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
            //inverter crec/desc < por >
            if(x[i] >= pivo) {
                i++;
            //inverter crec/desc < por >
            }else if(pivo > x[j]) {
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

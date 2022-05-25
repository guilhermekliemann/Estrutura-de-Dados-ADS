package br.com.kliemann.algoritmosdebusca;

import java.util.Scanner;

public class BuscaBinaria {

    public static void main(String[] args) {
        
        int[] x = {5, 6, 2, 1, 3, 11, 8, 7, 5};
        boolean achou = false;
        int inicio = 0, fim = x.length - 1, meio, buscando;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número para busca: ");
        buscando = sc.nextInt();

        meio = (inicio + fim) / 2;
        
        quickSort(x,0,x.length-1);
        
        while (inicio <= fim && !achou) {
            if(buscando == x[meio]) {
                achou = true;
            }else {
                if(buscando <= x[meio]) {
                    fim = meio - 1;
                    meio = (inicio + fim) / 2;
                }else {
                inicio = meio + 1;
                meio = (inicio + fim) / 2;
                }
            }
        }
        System.out.println(achou);
        
    }
    
    static void quickSort(int[] vetor, int esquerda, int direita) {
        
        if(esquerda < direita){
            int p = particao(vetor, esquerda, direita);
            quickSort(vetor, esquerda, p);
            quickSort(vetor, p + 1, direita);
        }
        
    }

    static int particao(int[] vetor, int esquerda, int direita) {
        
        int meio = (int) (esquerda + direita) / 2;
        int pivot = vetor[meio];
        int i = esquerda - 1;
        int j = direita + 1;
        while(true){
            do {
                i++;
            } while(vetor[i] < pivot);
            do {
                j--;
            } while(vetor[j] > pivot);
            if (i >= j){
                return j;
            }
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }
        
    }
    
}

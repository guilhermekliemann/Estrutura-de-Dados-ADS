package br.com.kliemann.listaconceitosbasicosjava;

public class Exercicio16 {

    public static void main(String[] args) {
        
        /*
        Declare uma matriz de 20 posições, sendo 4 linhas e 5 colunas. Insira os 20 primeiros números ímpares 
        nela. Depois, mostre-a na tela. 
        */

        int[][] matriz = {
            {1,3,5,7,9},
            {11,13,15,17,19},
            {21,23,25,27,29},
            {31,33,35,37,39}
        };

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    
}

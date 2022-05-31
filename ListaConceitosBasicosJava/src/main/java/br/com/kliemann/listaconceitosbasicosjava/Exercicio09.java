package br.com.kliemann.listaconceitosbasicosjava;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        
        /*
        Crie um vetor de 10 posições com 10 nomes de animais. Pode solicitar ao usuário ou já atribuir diretamente. 
        Depois peça ao usuário para escolher duas posições para trocar os nomes. Imprima o vetor antes da troca e 
        após. Obs: Necessário utilizar uma variável auxiliar.
        */
        
        //INCOMPLETO
        
        String[] animais = {"Cachorro","Gato","Peixe","Leão","Onça","Tucano","Flamingo","Tubarão","Vaca","Porco"};

        for(int i=0; i<animais.length; i++) {
            System.out.println("Posição " + i + " - " + animais[i]);
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEscolha a primeira posição para trocar os nomes:");
        int troca1 = sc.nextInt();
        System.out.println("Escolha a segunda posição para trocar os nomes:");
        int troca2 = sc.nextInt();
        
    }
    
    private static void troca(String[] animais, int troca1, int troca2) {

        int aux;
        
    }
    
}

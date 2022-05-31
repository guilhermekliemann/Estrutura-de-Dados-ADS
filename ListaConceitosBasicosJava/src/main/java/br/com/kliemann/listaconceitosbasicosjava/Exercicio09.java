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
        
        System.out.println("\n");
        
        Scanner sc = new Scanner(System.in);
        System.out.println(">Escolha a posição inicial da troca:");
        int x = sc.nextInt();
        System.out.println(">Escolha posição final da troca:");
        int y = sc.nextInt();
        
        System.out.println("\n");
        
        troca(x, y, animais);
        
        for(int i=0; i<animais.length; i++) {
            System.out.println("Posição " + i + " - " + animais[i]);
        }
        
    }

    public static void troca(int x, int y, String[] animais) {
        
        String aux = animais[x];
        animais[x] = animais[y];
        animais[y] = aux;
        
    }
    
}

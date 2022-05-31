package br.com.kliemann.listaconceitosbasicosjava;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        
        /*
        Utilizando o mesmo vetor de animais do exercício anterior, peço um nome de um animal ao usuário e 
        verifique se esse nome está no vetor. 
        */
        
        //INCOMPLETO - falta colocar animal nao foi encontrado
        
        String[] animais = {"Cachorro","Gato","Peixe","Leão","Onça","Tucano","Flamingo","Tubarão","Vaca","Porco"};

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome de um animal para verificar se ele está presente no vetor:");
        String nomeAnimal = sc.next();
        
        verificaAnimal(animais, nomeAnimal);
        
    }
    
    private static void verificaAnimal(String[] animais, String nomeAnimal) {
        
        for(int i=0; i<animais.length; i++) {
            if(animais[i].equals(nomeAnimal)) {
                System.out.println(animais[i] + " encontrado na posição " + i + " do vetor!");
            }
        }
        
    }
    
}

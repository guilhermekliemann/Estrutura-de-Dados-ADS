package br.com.kliemann.listaconceitosbasicosjava;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        
        /*
        Peça ao usuário qual foi sua nota final no ano letivo. Se a nota for menor que 6 e maior que 4, exiba 
        “precisa fazer prova substitutiva”. Se for maior que 6 exiba “aprovado”. Senão, exiba “reprovado”.
        */
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite sua nota final no ano letivo: ");
        double nota = sc.nextDouble();
        
        if(nota > 4.0 && nota < 6.0 || nota == 4.0) {
            System.out.println("Precisa fazer prova substitutiva!");
        } else if(nota > 6.0 || nota == 6.0) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }       
        
    }
    
}

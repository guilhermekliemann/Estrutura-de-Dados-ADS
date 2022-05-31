package br.com.kliemann.listaconceitosbasicosjava;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        
        /*
        Faça um algoritmo que ajude o professor de uma turma de alunos a saber quantas pessoas deverão compor 
        cada turma. O algoritmo deverá pedir ao usuário quantos alunos tem a sala e quantas turmas se deseja 
        dividir. Depois, apresente a quantidade de pessoas por turma e quantas pessoas ficarão “sem turma” (use mod). 
        */
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de alunos tem a sala: ");
        int qtdAlunos = sc.nextInt();
        System.out.println("Digite a quantidade de turmas que se deseja dividir: ");
        int qtdTurmas = sc.nextInt();
        
        int divisaoTurma = qtdAlunos / qtdTurmas;
        int resto = qtdAlunos % qtdTurmas;
        
        System.out.println("\nTerá " + divisaoTurma + " alunos por turma!\n" + 
                           "E ficará " + resto + " aluno(s) sem turma!\n");
        
    }
    
}

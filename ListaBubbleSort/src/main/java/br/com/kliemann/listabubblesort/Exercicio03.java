package br.com.kliemann.listabubblesort;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos: ");
        int qtdAlunos = sc.nextInt();
        
        double[] x;
        x = preencheVetor(qtdAlunos);
        System.out.println("Média de todos os alunos: " + imprimeVetor(x));
        
        x = bubble_sort_desc(x);
        System.out.println("Média dos alunos em ordem decrescente: " + imprimeVetor(x));
    }
    
    public static double[] preencheVetor(int qtdAlunos) {
        double[] x = new double[qtdAlunos];
        Scanner sc;
        sc = new Scanner(System.in);
        for (int c = 0; c < qtdAlunos; c++) {
            System.out.print("Informe a nota do " + (c + 1) + "º aluno: ");
            x[c] = sc.nextDouble();
        }
        return x;
    }

    public static String imprimeVetor(double[] x) {
        String vet = "";
        for (int c = 0; c < x.length; c++) {
            if (c == x.length - 1) {
                vet = vet + x[c] + ".";
            } else {
                vet = vet + x[c] + " - ";
            }
        }
        return vet;
    }
    
    public static double[] bubble_sort_desc(double[] x) {
        double aux = 0;

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

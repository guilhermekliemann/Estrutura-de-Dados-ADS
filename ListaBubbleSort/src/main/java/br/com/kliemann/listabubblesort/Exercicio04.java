package br.com.kliemann.listabubblesort;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        
        int qtdIdades;
        int idade[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de clientes que foram atendidos: ");
        qtdIdades = sc.nextInt();
        
        int[] x;
        x = preencheVetor(qtdIdades);
        x = bubble_sort_cres(x);
        System.out.println("Quantidade de clientes que foram atendidos: " + qtdIdades);
        System.out.println("Idade dos clientes em ordem crescente: " + imprimeVetor(x));
    }
    
    public static int[] preencheVetor(int qtdAlunos) {
        int[] x = new int[qtdAlunos];
        Scanner sc;
        sc = new Scanner(System.in);
        for (int c = 0; c < qtdAlunos; c++) {
            System.out.print("Informe a idade do " + (c + 1) + "º cliente: ");
            x[c] = sc.nextInt();
        }
        return x;
    }

    public static String imprimeVetor(int[] x) {
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
}

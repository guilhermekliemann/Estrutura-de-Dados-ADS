package br.com.kliemann.listaconceitosbasicosjava;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        
        /*
        Declare uma matriz de 24 posições, sendo 8 linhas e 3 colunas. insira nas colunas de cada linha os 3 
        lados de um triângulo. Após, imprima o número do triângulo (linha) e o seu tipo, conforme as regras 
        já vistas em outros exercícios.
        */
        
        Scanner sc = new Scanner(System.in);
        double[][] triangulo = new double[8][3];
        
        for(int i=0; i<triangulo.length; i++) {
            System.out.println("\nPIRAMIDE " + (i+1));
            System.out.println("LADO A: ");
            triangulo[i][0] = sc.nextDouble();
            System.out.println("LADO B: ");
            triangulo[i][1] = sc.nextDouble();
            System.out.println("LADO C: ");
            triangulo[i][2] = sc.nextDouble();
        }
        
        System.out.println("\n");
        
        for(int i = 0; i < triangulo.length; i++) {
            for(int j = 0; j < triangulo[i].length; j++) {
                System.out.print(triangulo[i][j] + " ");
            }
            System.out.println(" ");
        }
        
        String msg = "";
        
        for(int i=0; i<triangulo.length; i++) {
            msg += "\nTriângulo " + (i+1) + " - " + tipoTriangulo(triangulo[i][0],triangulo[i][1],triangulo[i][2]);
        }
        
        System.out.println(msg);
        
    }
    
    public static String tipoTriangulo(double a, double b, double c) {
        
        String msg = "Não é um triângulo!";
        
        if (a == b || b == c || c == a) {
            if (a == b && b == c) {
                msg = "Triângulo equilátero!";
            } else {
                msg = "Triângulo isósceles!";
            }
        }
        if (a != b && b != c && c != a) {
            msg = "Triângulo escaleno!";
        }
        
        return msg;
        
    }
    
}

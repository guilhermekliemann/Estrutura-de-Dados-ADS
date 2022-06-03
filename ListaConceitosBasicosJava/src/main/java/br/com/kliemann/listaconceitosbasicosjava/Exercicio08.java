package br.com.kliemann.listaconceitosbasicosjava;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        
        /*
        Repita o programa do exercício anterior, porém agora adicione uma comparação no resultado para indicar 
        se a pessoa está abaixo, na média ou acima da altura de um brasileiro (a). Para homens 18 a 24 anos, 
        170,8 cm e entre 25 a 39 ano 173,4 cm. Para mulheres entre 18 e 24 anos, 158,0 cm e entre 24 e 39 anos 
        161,0 cm. Caso não esteja nessas faixas etárias, valor indefinido.
        */
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual o seu gênero(homem/mulher)?");
        String genero = sc.next();
        System.out.println("Qual a sua idade?");
        int idade = sc.nextInt();
        System.out.println("Qual o seu peso?");
        double peso = sc.nextDouble();
        System.out.println("Qual a sua altura?");
        double altura = sc.nextDouble();
        
        verificarAltura(genero, idade, altura);
        
        calcularImc(peso, altura);
        
    }
    
    private static void verificarAltura(String genero, int idade, double altura) {
        
        if(genero.equals("homem")) {
            if(altura < 1.708 && idade >= 18 && idade < 24) {
                System.out.println("\nPara homens de 18 até 24 anos, você está abaixo da altura de um brasileiro!");
            } else if(altura == 1.708 && idade >= 18 && idade < 24) {
                System.out.println("\nPara homens de 18 até 24 anos, você está na média da altura de um brasileiro!");
            } else if(altura > 1.708 && idade >= 18 && idade < 24) {
                System.out.println("\nPara homens de 18 até 24 anos, você está acima da altura de um brasileiro!");
            } else if(altura < 1.744 && idade >= 24 && idade < 39) {
                System.out.println("\nPara homens de 25 até 39 anos, você está abaixo da altura de um brasileiro!");
            } else if(altura == 1.744 && idade >= 24 && idade < 39) {
                System.out.println("\nPara homens de 25 até 39 anos, você está na média da altura de um brasileiro!");
            } else if(altura > 1.744 && idade >= 24 && idade < 39) {
                System.out.println("\nPara homens de 25 até 39 anos, você está acima da altura de um brasileiro!");
            } else {
                System.out.println("\nValor indefinido!");
            }
        } else if(genero.equals("mulher")) {
            if(altura < 1.580 && idade >= 18 && idade < 24) {
                System.out.println("\nPara mulheres de 18 até 24 anos, você está abaixo da altura de uma brasileira!");
            } else if(altura == 1.580 && idade >= 18 && idade < 24) {
                System.out.println("\nPara mulheres de 18 até 24 anos, você está na média da altura de uma brasileira!");
            } else if(altura > 1.580 && idade >= 18 && idade < 24) {
                System.out.println("\nPara mulheres de 18 até 24 anos, você está acima da altura de uma brasileira!");
            } else if(altura < 1.610 && idade >= 24 && idade < 39) {
                System.out.println("\nPara mulheres de 24 até 39 anos, você está abaixo da altura de uma brasileira!");
            } else if(altura == 1.610 && idade >= 24 && idade < 39) {
                System.out.println("\nPara mulheres de 24 até 39 anos, você está na média da altura de uma brasileira!");
            } else if(altura > 1.610 && idade >= 24 && idade < 39) {
                System.out.println("\nPara mulheres de 24 até 39 anos, você está acima da altura de uma brasileira!");
            }
        }
        
    }
    
    private static void calcularImc(double peso, double altura) {
        
        double imc = peso / Math.pow(altura,2);
        
        if(imc < 18.5) {
            System.out.println("\nO seu IMC é de " + String.format("%.1f",imc) + " e você está abaixo do peso");
        } else if(imc >= 18.5 && imc < 25) {
            System.out.println("\nO seu IMC é de " + String.format("%.1f",imc) + " e você está com o peso normal");
        } else if(imc >= 25 && imc < 30) {
            System.out.println("\nO seu IMC é de " + String.format("%.1f",imc) + " e você está acima do peso");
        } else if(imc >= 30) {
            System.out.println("\nO seu IMC é de " + String.format("%.1f",imc) + " e você está obeso");
        }
        
    }
    
}

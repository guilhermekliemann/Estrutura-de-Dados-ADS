package br.com.kliemann.listaconceitosbasicosjava;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        
        /*
        Faça um algoritmo que peça ao usuário o valor vendido, a meta e a meta mínima do mês. Faça os cálculos e 
        exiba: 
        a) Se atingiu a meta ou se atingiu a meta mínima ou nenhuma delas;
        b) Qual o percentual de atingimento da meta (valor vendido / meta);
        c) Qual o percentual de atingimento da meta mínima (valor vendido/meta mínima).
        */
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Valor vendido: ");
        double valorVendido = sc.nextDouble();
        System.out.println("Meta mensal: ");
        double meta = sc.nextDouble();
        System.out.println("Meta mensal minima: ");
        double metaMin = sc.nextDouble();
        
        double percentualMeta = (valorVendido * 100) / meta;
        double percentualMetaMin = (metaMin * 100)/ valorVendido;
        
        if(valorVendido > meta) {
            System.out.println("Você atingiu " + String.format("%.0f",percentualMeta) + "% da meta mensal!");
        } else if(valorVendido > metaMin && valorVendido < meta) {
            System.out.println("Você atingiu " + String.format("%.0f",percentualMetaMin) + "% da meta minima mensal!");
        } else {
            System.out.println("Você não atingiu a meta mensal!");
        }
        
    }
    
}

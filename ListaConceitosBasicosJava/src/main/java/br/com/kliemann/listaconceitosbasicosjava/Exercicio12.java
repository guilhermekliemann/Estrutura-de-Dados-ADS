package br.com.kliemann.listaconceitosbasicosjava;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        
        /*
        Crie três vetores de 10 posições, sendo um de cadeia e um de real, chamados disciplinas, professores e 
        médias. insira as disciplinas que você está cursando esse período no vetor de disciplinas e os respectivos 
        professores no vetor de professores, sempre na mesma posição. Depois, peça ao usuário seu nome, RA, e as 
        notas que tirou em cada disciplina. No final, exiba um Boletim de notas, informando o nome do aluno, RA, 
        a disciplina, o professor, a nota e o resultado obtido. Obs: Faça os números ficarem alinhados Ex:
        .:BOLETIM DE NOTAS:
        Acadêmicos: Fulano de tal 			RA: 00000000
        > ALGORITMOS E FUNDAMENTOS DE PROGRAMAÇÃO - PROF. FERNANDO BOTELHO - Nota 1º Bim:  8,0
        > ….
        */
        
        String[] disciplinas = {"ANALISE E PROJETO DE SISTEMAS","ESTATISTICA","ESTRUTURA E CLASSIFICACAO DE DADOS",
                                "FILOSOFIA E ETICA","PROGRAMACAO ORIENTADA A OBJETOS","PROGRAMACAO PARA AMBIENTES VISUAIS",
                                "REDES DE COMPUTADORES E SEGURANÇA DA INFORMAÇÃO","TECNOLOGIA DA INFORMACAO E COMUNICACAO"};
        String[] professores = {"ANDERSON BOSING","MARCELO GIMENES","FERNANDO BOTELHO","MARTA FIORENTIN",
                                "ANDERSON BOSING","PAULO HENRIQUE","JULIANO TRIACCA","VINICIUS TAVARES"};
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o seu NOME:");
        String nome = sc.next();
        System.out.println("Digite o seu SOBRENOME");
        String sobrenome = sc.next();
        System.out.println("Digite o seu RA:");
        int ra = sc.nextInt();
        
        double[] notas = new double[8];
        for(int i=0; i<notas.length; i++) {
            System.out.println("Qual foi sua nota na disciplina de " + disciplinas[i] + "?");
            notas[i] = sc.nextDouble();
        }
        
        System.out.println("BOLETIM DE NOTAS:\n" + 
                           "Acadêmico: " + nome + " " + sobrenome + "   " + " RA: " + ra);
        for(int i=0; i<8; i++) {
            System.out.println(">" + disciplinas[i] + " - " + "PROF. " + professores[i] + " - " + "Nota 1ºBim: " 
                               + notas[i]);
        }
        
    }
    
}

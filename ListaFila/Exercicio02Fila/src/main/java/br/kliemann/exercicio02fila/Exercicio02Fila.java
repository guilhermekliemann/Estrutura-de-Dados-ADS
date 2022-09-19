package br.kliemann.exercicio02fila;

import br.kliemann.exercicio02fila.model.Cliente;
import br.kliemann.exercicio02fila.model.Fila;
import javax.swing.JOptionPane;

/*
Um banco necessita de uma sistema para controlar a fila de pagamentos no caixa. 
Para o atendimento é obedecido a lei de prioridade, onde a cada 2 clientes 
prioritários, um cliente normal é atendido. Desenvolva um algoritmo para 
controlar a fila de atendimento, para isso deverá ser criado 2 filas, uma de 
atendimento prioritário e outra de atendimento normal. Na fila será cadastrado 
os seguintes dados do cliente:

Cliente
- int senha;
- String nome;
- int anoNascimento;

Deverá ser determinado pela a idade qual fila será inserido o cliente, acima 
de 65 anos fila prioritária, os demais na fila normal. Crie um menu com 
uma opção para adicionar o cliente, e outra para chamar o cliente. Lembre-se 
deverá seguir a regra de ao ser atendido 2 clientes prioritários será 
atendido um cliente normal.
*/

public class Exercicio02Fila {

    public static Fila filaNormal;
    public static Fila filaPrioritaria;
    public static Fila filaAux;
    public static int cont = 0;
    
    public static void main(String[] args) {
        
        filaNormal = new Fila(10);
        filaPrioritaria = new Fila(10);
        filaAux = new Fila(10);
        
        Cliente a = new Cliente(1, "Guilherme", 2003);
        Cliente b = new Cliente(2, "Emily", 2004);
        Cliente c = new Cliente(3, "Flavio", 1950);
        Cliente d = new Cliente(4, "Anete", 1953);
        Cliente e = new Cliente(5, "Milena", 2005);
        Cliente f = new Cliente(6, "Derick", 1951);
        Cliente g = new Cliente(7, "João", 1960);
        Cliente h = new Cliente(8, "Anna", 1955);
        Cliente i = new Cliente(9, "Jhony", 1999);
        Cliente j = new Cliente(10, "Débora", 2003);
        
        filaAux.enqueue(a);
        filaAux.enqueue(b);
        filaAux.enqueue(c);
        filaAux.enqueue(d);
        filaAux.enqueue(e);
        filaAux.enqueue(f);
        filaAux.enqueue(g);
        filaAux.enqueue(h);
        filaAux.enqueue(i);
        filaAux.enqueue(j);
        
        int opcao;
        
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções: " + 
                                                                 "\n1 - Adicionar cliente" +
                                                                 "\n2 - Chamar cliente" +
                                                                 "\n0 - Encerrar programa"));
            
            switch(opcao) {
                case 1:
                    adicionarCliente();
                    break;
                case 2:
                    chamarCliente();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Programa encerrado!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
            
        } while(opcao != 0);
        
    }
    
    private static void adicionarCliente() {
        
        if(!filaNormal.isFull() && (2022 - filaAux.mostraPosicaoInicio().getAnoNascimento()) < 65) {
            JOptionPane.showMessageDialog(null, "Cliente [" + filaAux.mostraPosicaoInicio().getNome() + "] adicionado na fila normal!");
            filaNormal.enqueue(filaAux.dequeue());
        } else {
            JOptionPane.showMessageDialog(null, "Cliente [" + filaAux.mostraPosicaoInicio().getNome() + "] adicionado na fila prioritária!");
            filaPrioritaria.enqueue(filaAux.dequeue());
        }
        
    }
    
    private static void chamarCliente() {
        
        if(!filaPrioritaria.isEmpty() && cont == 2) {
            JOptionPane.showMessageDialog(null, "Cliente [" + filaPrioritaria.dequeue().getNome() + "] foi chamado para o atendimento! (Fila Prioritária)");
            cont = 0;
        } else {
            JOptionPane.showMessageDialog(null, "Cliente [" + filaNormal.dequeue().getNome() + "] foi chamado para o atendimento! (Fila Normal)");
            cont++;
        }
        
    }
    
}

package br.kliemann.exercicio01pilha;

import javax.swing.JOptionPane;

public class Main {

    private static Pilha<String> pilha;
    
    public static void main(String[] args) {
        
        pilha = new Pilha<>(10);
        
        int opcao;
        
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma das opções abaixo:\n\n"
                                                               + "1- Adicionar livro na pilha\n"
                                                               + "2- Listar livros da pilha\n"
                                                               + "3- Remover livros da pilha\n"
                                                               + "0- Encerrar programa"));
            
            switch(opcao) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Programa encerrado!");
                    break;
                case 1: 
                    adicionaLivro(pilha);
                    break;
                case 2:
                    listarLivros(pilha);
                    break;
                case 3:
                    removerLivros(pilha);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
            
        } while(opcao != 0);
        
    }
    
    private static void adicionaLivro(Pilha pilha) {
        
        if(!pilha.isFull()) {
            String nomeLivro = JOptionPane.showInputDialog("Digite o nome do livro:");
            if(nomeLivro != null) {
                pilha.push(nomeLivro);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Pilha cheia!");
        }
        
    }
    
    private static void listarLivros(Pilha pilha) {
        
        String msg = "Livros que estão armazenados na pilha:\n";
        
        int aux = pilha.getPosicaoTopo();
        
        while(!pilha.isEmpty()) {
            msg += "\n" + pilha.pop();
        }
        
        JOptionPane.showMessageDialog(null, msg);
        pilha.setPosicaoTopo(aux);
    }
    
    private static void removerLivros(Pilha pilha) {
                
        JOptionPane.showMessageDialog(null, "Ultimo livro da pilha removido: " + pilha.pop());
        
    }
    
}
package br.kliemann.exercicio02pilha;

import br.kliemann.exercicio02pilha.model.Pilha;
import br.kliemann.exercicio02pilha.model.Produto;
import javax.swing.JOptionPane;

public class Main {

    private static Pilha<Produto> pilha;
    private static Pilha<Produto> pilha2;
    
    public static void main(String[] args) {
        
        Produto a = new Produto(1, "Caixa Molinete", "13/01/22", "SP", "PR");
        Produto b = new Produto(2, "Caixa Carretilha", "13/01/22", "MG", "RJ");
        Produto c = new Produto(3, "Caixa Isca Artificial", "13/01/22", "RJ", "PR");
        Produto d = new Produto(4, "Caixa Boia", "13/01/22", "SP", "MT");
        Produto e = new Produto(5, "Caixa Vara para Molinete", "13/01/22", "PR", "RS");
        Produto f = new Produto(6, "Caixa Vara para Carretilha", "13/01/22", "MS", "MT");
        Produto g = new Produto(7, "Caixa Anzol", "13/01/22", "PR", "PA");
        Produto h = new Produto(8, "Caixa Linha", "13/01/22", "PR", "RS");
        Produto i = new Produto(9, "Caixa Cevadeira", "13/01/22", "PR", "RS");
        Produto j = new Produto(10, "Caixa Chumbada", "13/01/22", "PR", "SC");
        
        pilha = new Pilha<>(10);
        pilha2 = new Pilha<>(10);
        
        pilha2.push(a);
        pilha2.push(b);
        pilha2.push(c);
        pilha2.push(d);
        pilha2.push(e);
        pilha2.push(f);
        pilha2.push(g);
        pilha2.push(h);
        pilha2.push(i);
        pilha2.push(j);
        
        int opcao;
        
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma das opções abaixo:\n\n"
                                                               + "1 - Adiciona caixa na pilha\n"
                                                               + "2 - Remove caixa da pilha\n"
                                                               + "3 - Listar pilha\n"
                                                               + "4 - Listar produtos\n"
                                                               + "0 - Encerrar programa"));
            
            switch(opcao) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Programa encerrado!");
                    break;
                case 1: 
                    adicionaCaixa();
                    break;
                case 2:
                    removeCaixa();
                    break;
                case 3:
                    listarPilha();
                    break;
                case 4:
                    listarCaixas();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
            
        } while(opcao != 0);
        
    }
    
    public static void adicionaCaixa() {
     
        if(!pilha.isFull()) {
            pilha.push(pilha2.top());
            pilha2.pop();
            JOptionPane.showMessageDialog(null, pilha.top().getDescricao() + " adicionada na pilha!");
        } else {
            JOptionPane.showMessageDialog(null, "Pilha cheia!");
        }
        
    }
    
    public static void removeCaixa() {
        
        JOptionPane.showMessageDialog(null, pilha.top().getDescricao() + " removido da pilha!");
        pilha2.push(pilha.top());
        pilha.pop();
        
    }
    
    private static void listarPilha() {
        
        int aux = pilha.getPosicaoTopo();
        String msg = "Produtos da Pilha:\n";
        
        while (!pilha.isEmpty()) {
            if(pilha.getPosicaoTopo() == -1){
                break;
            }
            
            msg += "\n" + pilha.top().getDescricao();
            pilha.pop();
        }
        pilha.setPosicaoTopo(aux);
        JOptionPane.showMessageDialog(null, msg);
        
        
    }
    
    private static void listarCaixas() {
        
        int aux = pilha2.getPosicaoTopo();
        String str = "Lista de Caixas não empilhadas:\n";
        
        while (!pilha2.isEmpty()) {
            if(pilha2.getPosicaoTopo()== -1){
                break;
            }
            str += "\n" + pilha2.top().getDescricao();
            pilha2.pop();
        }
        pilha2.setPosicaoTopo(aux);
        JOptionPane.showMessageDialog(null, str);
        
    }

}
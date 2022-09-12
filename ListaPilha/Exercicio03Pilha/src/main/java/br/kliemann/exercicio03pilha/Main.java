package br.kliemann.exercicio03pilha;

import br.kliemann.exercicio03pilha.model.Pilha;
import br.kliemann.exercicio03pilha.model.Produto;
import javax.swing.JOptionPane;

public class Main {

    private static Pilha<Produto> caixa;
    private static Pilha<Produto> pilha1;
    private static Pilha<Produto> pilha2;
    private static Pilha<Produto> pilha3;
    private static Pilha<Produto> pilha4;
    private static Pilha<Produto> pilha5;
    
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
        
        caixa = new Pilha<>(10);
        pilha1 = new Pilha<>(10);
        pilha2 = new Pilha<>(10);
        pilha3 = new Pilha<>(10);
        pilha4 = new Pilha<>(10);
        pilha5 = new Pilha<>(10);
        
        caixa.push(a);
        caixa.push(b);
        caixa.push(c);
        caixa.push(d);
        caixa.push(e);
        caixa.push(f);
        caixa.push(g);
        caixa.push(h);
        caixa.push(i);
        caixa.push(j);
        
        int opcao;
        
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma das opções abaixo:\n\n"
                                                               + "1 - Adiciona caixa na pilha\n"
                                                               + "2 - Remove caixa da pilha\n"
                                                               + "3 - Listar pilhas\n"
                                                               + "4 - Listar caixas\n"
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
                    listarPilhas();
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
     
        int pilha = Integer.parseInt(JOptionPane.showInputDialog("Qual pilha você quer adicionar a caixa: (Pilhas 1, 2, 3, 4, 5)\n"));
        
        switch(pilha) {
            case 1:
                 if(!pilha1.isFull()) {
                    pilha1.push(caixa.top());
                    caixa.pop();
                    JOptionPane.showMessageDialog(null, pilha1.top().getDescricao() + " adicionada na pilha 1!");
                } else {
                    JOptionPane.showMessageDialog(null, "Pilha 1 está cheia!");
                }
                break;
            case 2:
                if(!pilha2.isFull()) {
                    pilha2.push(caixa.top());
                    caixa.pop();
                    JOptionPane.showMessageDialog(null, pilha2.top().getDescricao() + " adicionada na pilha 2!");
                } else {
                    JOptionPane.showMessageDialog(null, "Pilha 2 está cheia!");
                }
                break;
            case 3:
                if(!pilha3.isFull()) {
                    pilha3.push(caixa.top());
                    caixa.pop();
                    JOptionPane.showMessageDialog(null, pilha3.top().getDescricao() + " adicionada na pilha 3!");
                } else {
                    JOptionPane.showMessageDialog(null, "Pilha 3 está cheia!");
                }
                break;
            case 4:
                if(!pilha4.isFull()) {
                    pilha4.push(caixa.top());
                    caixa.pop();
                    JOptionPane.showMessageDialog(null, pilha4.top().getDescricao() + " adicionada na pilha 4!");
                } else {
                    JOptionPane.showMessageDialog(null, "Pilha 4 está cheia!");
                }
                break;
            case 5:
                if(!pilha5.isFull()) {
                    pilha5.push(caixa.top());
                    caixa.pop();
                    JOptionPane.showMessageDialog(null, pilha5.top().getDescricao() + " adicionada na pilha 5!");
                } else {
                    JOptionPane.showMessageDialog(null, "Pilha 5 está cheia!");
                }
                break;
            default: 
                JOptionPane.showMessageDialog(null, "Pilha inválida! (Pilhas 1, 2, 3, 4, 5)");
                break;
        }
        
    }
    
    public static void removeCaixa() {
        
        int pilha = Integer.parseInt(JOptionPane.showInputDialog("Qual pilha você quer remover a caixa: (Pilhas 1, 2, 3, 4, 5)\n"));
        
        switch(pilha) {
            case 1:
                JOptionPane.showMessageDialog(null, pilha1.top().getDescricao() + " removido da pilha 1!");
                pilha1.pop();
                break;
            case 2:
                JOptionPane.showMessageDialog(null, pilha2.top().getDescricao() + " removido da pilha 2!");
                pilha2.pop();
                break;
            case 3:
                JOptionPane.showMessageDialog(null, pilha3.top().getDescricao() + " removido da pilha 3!");
                pilha3.pop();
                break;
            case 4:
                JOptionPane.showMessageDialog(null, pilha4.top().getDescricao() + " removido da pilha 4!");
                pilha4.pop();
                break;
            case 5:
                JOptionPane.showMessageDialog(null, pilha5.top().getDescricao() + " removido da pilha 5!");
                pilha5.pop();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Pilha inválida! (Pilhas 1, 2, 3, 4, 5)");
                break;
        }
    }
    
    private static void listarPilhas() {
        
        // pilha 1
        int aux = pilha1.getPosicaoTopo();
        String msg = "Produtos da Pilha 1:\n";
        
        while (!pilha1.isEmpty()) {
            if(pilha1.getPosicaoTopo() == -1){
                break;
            }
            
            msg += "\n" + pilha1.top().getDescricao();
            pilha1.pop();
        }
        
        pilha1.setPosicaoTopo(aux);
        JOptionPane.showMessageDialog(null, msg);
        
        // pilha 2
        aux = pilha2.getPosicaoTopo();
        msg = "Produtos da Pilha 2:\n";
        
        while (!pilha2.isEmpty()) {
            if(pilha2.getPosicaoTopo() == -1){
                break;
            }
            
            msg += "\n" + pilha2.top().getDescricao();
            pilha2.pop();
        }
        
        pilha2.setPosicaoTopo(aux);
        JOptionPane.showMessageDialog(null, msg);
        
        // pilha 3
        aux = pilha3.getPosicaoTopo();
        msg = "Produtos da Pilha 3:\n";
        
        while (!pilha3.isEmpty()) {
            if(pilha3.getPosicaoTopo() == -1){
                break;
            }
            
            msg += "\n" + pilha3.top().getDescricao();
            pilha3.pop();
        }
        
        pilha3.setPosicaoTopo(aux);
        JOptionPane.showMessageDialog(null, msg);
        
        // pilha 4
        aux = pilha4.getPosicaoTopo();
        msg = "Produtos da Pilha 4:\n";
        
        while (!pilha4.isEmpty()) {
            if(pilha4.getPosicaoTopo() == -1){
                break;
            }
            
            msg += "\n" + pilha4.top().getDescricao();
            pilha4.pop();
        }
        
        pilha4.setPosicaoTopo(aux);
        JOptionPane.showMessageDialog(null, msg);

        // pilha 5
        aux = pilha5.getPosicaoTopo();
        msg = "Produtos da Pilha 5:\n";
        
        while (!pilha5.isEmpty()) {
            if(pilha5.getPosicaoTopo() == -1){
                break;
            }
            
            msg += "\n" + pilha5.top().getDescricao();
            pilha5.pop();
        }
        
        pilha5.setPosicaoTopo(aux);
        JOptionPane.showMessageDialog(null, msg);
        
    }
    
    private static void listarCaixas() {
        
        int aux = caixa.getPosicaoTopo();
        String str = "Produtos da Pilha:\n";
        
        while (!caixa.isEmpty()) {
            if(caixa.getPosicaoTopo() == -1){
                break;
            }
            str += "\n" + caixa.top().getDescricao();
            caixa.pop();
        }
        
        JOptionPane.showMessageDialog(null, str);
        pilha2.setPosicaoTopo(aux);
    }

}
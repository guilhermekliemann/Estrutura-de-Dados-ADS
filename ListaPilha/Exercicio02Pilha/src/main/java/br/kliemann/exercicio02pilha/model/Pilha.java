package br.kliemann.exercicio02pilha.model;

public class Pilha<Produto> {
    
    private Produto[] pilha;
    private int posicaoTopo;

    public Produto[] getPilha() {
        return pilha;
    }

    public void setPilha(Produto[] pilha) {
        this.pilha = pilha;
    }

    public int getPosicaoTopo() {
        return posicaoTopo;
    }

    public void setPosicaoTopo(int posicaoTopo) {
        this.posicaoTopo = posicaoTopo;
    }

    public Pilha(int tamanho) {
        pilha = (Produto[]) new Object[tamanho];
        posicaoTopo = -1;
    }
    
    public void push(Produto e) {
        pilha[++posicaoTopo] = e;
    }
    
    public Produto pop() {
        return pilha[posicaoTopo--];
    }
    
    public Produto top() {
        return pilha[posicaoTopo];
    }
    
    public boolean isEmpty() {
        return posicaoTopo == -1;
    }
    
    public boolean isFull() {
        return posicaoTopo == pilha.length-1;
    }
    
}

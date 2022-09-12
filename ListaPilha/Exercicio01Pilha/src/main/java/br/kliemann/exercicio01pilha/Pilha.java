package br.kliemann.exercicio01pilha;

public class Pilha<String> {
    
    private String[] pilha;
    private int posicaoTopo;

    public String[] getPilha() {
        return pilha;
    }

    public void setPilha(String[] pilha) {
        this.pilha = pilha;
    }

    public int getPosicaoTopo() {
        return posicaoTopo;
    }

    public void setPosicaoTopo(int posicaoTopo) {
        this.posicaoTopo = posicaoTopo;
    }
    
    public Pilha(int tamanho) {
        pilha = (String[]) new Object[tamanho];
        posicaoTopo = -1;
    }
    
    public void push(String e) {
        pilha[++posicaoTopo] = e;
    }
    
    public String pop() {
        return pilha[posicaoTopo--];
    }
    
    public String top() {
        return pilha[posicaoTopo];
    }
    
    public void peek(String e) {
        pilha[posicaoTopo] = e;
    }
    
    public boolean isEmpty() {
        return posicaoTopo == -1;
    }
    
    public boolean isFull() {
        return posicaoTopo == pilha.length-1;
    }
    
}

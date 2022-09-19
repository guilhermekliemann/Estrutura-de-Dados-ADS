package br.kliemann.exercicio01fila;

public class Fila {
    
    private String[] dados;
    private int posicaoInicio;
    private int posicaoFinal;
    private int numItens;
    
    public Fila(int maximo) {
        dados = new String[maximo];
        posicaoInicio = 0;
        posicaoFinal = -1;
        numItens = 0;
    }
    
    public void enqueue(String num) {
        if(posicaoFinal == dados.length-1) {
            posicaoFinal = -1;
        }
        dados[++posicaoFinal] = num;
        numItens++;
    }
    
    public String dequeue() {
        String temp = dados[posicaoInicio++];
        if(posicaoInicio == dados.length) {
            posicaoInicio = 0;
        }
        numItens--;
        return temp;
    }
    
    public boolean isEmpty() {
        return numItens == 0;
    }
    
    public boolean isFull() {
        return numItens == dados.length;
    }
    
}

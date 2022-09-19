package br.kliemann.exercicio02fila.model;

public class Fila {
    
    private Cliente[] dados;
    private int posicaoInicio;
    private int posicaoFinal;
    private int numItens;
    
    public Fila(int maximo) {
        dados = new Cliente[maximo];
        posicaoInicio = 0;
        posicaoFinal = -1;
        numItens = 0;
    }
    
    public void enqueue(Cliente num) {
        if(posicaoFinal == dados.length-1) {
            posicaoFinal = -1;
        }
        dados[++posicaoFinal] = num;
        numItens++;
    }
    
    public Cliente dequeue() {
        Cliente temp = dados[posicaoInicio++];
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
    
    public Cliente mostraPosicaoInicio(){
        Cliente temp = dados[posicaoInicio];
        if(posicaoInicio == dados.length){
            posicaoInicio = 0;
        }
        return temp;
    }
    
}

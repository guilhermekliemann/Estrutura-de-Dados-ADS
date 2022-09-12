package br.kliemann.exercicio03pilha.model;

public class Produto {
    
    private int codProduto;
    private String descricao;
    private String dataEntrega;
    private String ufOrigem;
    private String ufDestino;

    public Produto(int codProduto, String descricao, String dataEntrega, String ufOrigem, String ufDestino) {
        this.codProduto = codProduto;
        this.descricao = descricao;
        this.dataEntrega = dataEntrega;
        this.ufOrigem = ufOrigem;
        this.ufDestino = ufDestino;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getUfOrigem() {
        return ufOrigem;
    }

    public void setUfOrigem(String ufOrigem) {
        this.ufOrigem = ufOrigem;
    }

    public String getUfDestino() {
        return ufDestino;
    }

    public void setUfDestino(String ufDestino) {
        this.ufDestino = ufDestino;
    }
    
}

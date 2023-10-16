package com.ambev.pratico2.HerancaPolimorfismo;

public class Produto {
    private int id;
    private String descricao;
    private double preco;
    private String nome;

    public Produto(int id, String descricao, double preco, String nome){
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

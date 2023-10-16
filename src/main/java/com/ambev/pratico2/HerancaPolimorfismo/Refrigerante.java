package com.ambev.pratico2.HerancaPolimorfismo;

public class Refrigerante extends Produto{
    private boolean comAcucar;
    public Refrigerante(int id, String descricao, double preco, boolean comAcucar, String nome) {
        super(id, descricao, preco, nome);
        this.comAcucar = comAcucar;
    }

    public boolean isComAcucar() {
        return comAcucar;
    }

    public void setComAcucar(boolean comAcucar) {
        this.comAcucar = comAcucar;
    }
}

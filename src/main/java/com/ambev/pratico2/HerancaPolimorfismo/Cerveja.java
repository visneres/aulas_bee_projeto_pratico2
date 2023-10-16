package com.ambev.pratico2.HerancaPolimorfismo;

public class Cerveja extends Produto{
    private boolean comAlcool;

    public Cerveja(int id, String descricao, double preco, boolean comAlcool, String nome) {
        super(id, descricao, preco, nome);
        this.comAlcool = comAlcool;
    }

    public boolean isComAlcool() {
        return comAlcool;
    }

    public void setComAlcool(boolean comAlcool) {
        this.comAlcool = comAlcool;
    }

}

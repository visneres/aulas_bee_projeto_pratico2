package com.ambev.pratico2.ComposicaoInterfaces;

public class Gerente implements CalcularAjudaCusto, CalcularImpostoRenda{

    private Funcionario funcionario;


    public Gerente(Funcionario funcionario){
        this.funcionario = funcionario;
    }


    @Override
    public double CalcularAjudaCusto() {
        return funcionario.getSalario() * 0.05;
    }

    @Override
    public double CalcularImpostoRenda() {
        return funcionario.getSalario() * 0.1;
    }

}

package com.ambev.pratico2.ComposicaoInterfaces;

public class Dev implements CalcularImpostoRenda, CalcularAjudaCusto{

    private Funcionario funcionario;

    public Dev (Funcionario funcionario){
        this.funcionario = funcionario;
    }



    @Override
    public double CalcularAjudaCusto() {
        return funcionario.getSalario() * 0.1;
    }

    @Override
    public double CalcularImpostoRenda() {
        return funcionario.getSalario() * 0.05;
    }
}

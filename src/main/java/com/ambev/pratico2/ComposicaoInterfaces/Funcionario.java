package com.ambev.pratico2.ComposicaoInterfaces;

public class Funcionario {

    private String nome;
    private String cpf;
    private String telefone;
    private double salario;
    private Endereco endereco;

    public Funcionario(String nome, String cpf, String telefone, double salario, Endereco endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.salario = salario;
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String toString(){
        return "INFORMAÇÕES DO FUNCIONÁRIO" +
                "\nNome: " + nome +
                "\nCPF: " + cpf +
                "\nTelefone: " + telefone +
                "\nSalário: R$" + salario +
                "\n"+ endereco;
    }

    public static void main(String[] args) {
        Funcionario funcionarioUm = new Funcionario(
                "Alice",
                "123.456.789-01",
                "11 922334455",
                5000.10,
                new Endereco("Tulipas", "Jardim", "Flores")
        );

        System.out.println(funcionarioUm);
    }

}

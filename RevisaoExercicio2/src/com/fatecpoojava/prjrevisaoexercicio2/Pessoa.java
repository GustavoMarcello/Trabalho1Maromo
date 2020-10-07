package com.fatecpoojava.prjrevisaoexercicio2;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void aniversario(){
        this.idade += 1;
    }

    public void imprimir(){
        System.out.println("nome = " + nome);
        System.out.println("idade = " + idade);
    }
}

package com.fatecpoojava.prjrevisaoexercicio1;

import java.time.LocalDate;
import java.util.Scanner;

public class Funcionario {

    private int idFunc;
    private String nomeFunc;
    private String departamento;
    private LocalDate dataContratacao;
    private double salario;
    private String documento;
    private boolean ativo = true;

    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void atualizarSalario(){
        double aumento;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do aumento de salário:");
        aumento = sc.nextDouble();

        if (aumento < 0){
            System.out.println("Aumento inválido!");
        }else {
            this.salario += aumento;
        }
    }

    public void demiteFuncionario(){
        this.ativo = false;
    }

    public void imprimir(){
        System.out.println("idFunc = " + idFunc);
        System.out.println("nomeFunc = " + nomeFunc);
        System.out.println("departamento = " + departamento);
        System.out.println("dataContratacao = " + dataContratacao);
        System.out.println("salario = " + salario);
        System.out.println("documento = " + documento);
        System.out.println("ativo = " + ativo);
        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("");
    }
}

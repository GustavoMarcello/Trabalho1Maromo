package com.fatecpoojava.prjrevisaoexercicio3;

import java.util.Scanner;

public class Porta {
    private boolean aberta;
    private String cor;
    private double dimensaoX;
    private double dimensaoY;
    private double dimensaoZ;

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(double dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public double getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(double dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public double getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(double dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }

    public void abre(){
        this.aberta = true;
    }
    public void fecha(){
        this.aberta = false;
    }
    public void pinta(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a cor a pintar a casa");
        this.cor = sc.nextLine();

    }

    public void alterarDimensao(){
        String dimensao;
        double valor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite qual dimensão alterar:");
        dimensao = sc.nextLine();
        System.out.println("Digite o valor da dimensão");
        valor = sc.nextDouble();

        if (dimensao.equals("x")){
            this.dimensaoX = valor;
        }
        if (dimensao.equals("y")){
            this.dimensaoY = valor;
        }
        if (dimensao.equals("z")){
            this.dimensaoZ = valor;
        }else{
            System.out.println("Dimensão inválida");
        }
    }

    public void estaAberta(){
        if (this.aberta == true){
            System.out.println("A porta está aberta.");
        }else{
            System.out.println("A porta está fechada.");
        }
    }

    public void imprimir(){
        if (this.aberta == true){
            System.out.println("A porta está aberta.");
        }else {
            System.out.println("A porta está fechada.");
        }
        System.out.println("A cor da porta é: " + cor);
        System.out.println("dimensaoX = " + dimensaoX);
        System.out.println("dimensaoY = " + dimensaoY);
        System.out.println("dimensaoZ = " + dimensaoZ);
        System.out.println("");
        System.out.println("-------------------------");
    }
}

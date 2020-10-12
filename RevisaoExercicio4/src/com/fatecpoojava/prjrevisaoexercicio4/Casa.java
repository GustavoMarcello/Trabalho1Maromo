package com.fatecpoojava.prjrevisaoexercicio4;

import java.util.Scanner;

public class Casa {
    private String cor;
    private int porta1;
    private int porta2;
    private int porta3;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPorta1() {
        return porta1;
    }

    public void setPorta1(int porta1) {
        this.porta1 = porta1;
    }

    public int getPorta2() {
        return porta2;
    }

    public void setPorta2(int porta2) {
        this.porta2 = porta2;
    }

    public int getPorta3() {
        return porta3;
    }

    public void setPorta3(int porta3) {
        this.porta3 = porta3;
    }

    public void pinta(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a cor a pintar a casa");
        this.cor = sc.nextLine();
    }

    public void abrir(){
        Scanner sc = new Scanner(System.in);
        int porta;
        System.out.println("Digite qual porta deseja abrir");
        porta =  sc.nextInt();

        if(porta == 1){
            this.porta1 = 1;
        }
        else if (porta == 2){
            this.porta2 = 1;
        }
        else if (porta == 3){
            this.porta3 = 1;
        }else {
            System.out.println("Porta inválida");
            System.out.println("");
        }
    }

    public void fechar(){
        Scanner sc = new Scanner(System.in);
        int porta;
        System.out.println("Digite qual porta deseja fechar");
        porta =  sc.nextInt();

        if(porta == 1){
            this.porta1 = 0;
        }
        else if (porta == 2){
            this.porta2 = 0;
        }
        else if (porta == 3){
            this.porta3 = 0;
        }else {
            System.out.println("Porta inválida");
            System.out.println("");
        }
    }

    public int quantasPortasEstaoAbertas(){
        int soma;
        soma = this.porta1 + this.porta2 + this.porta3;
        System.out.println("Total portas abertas: " + soma);
        return soma;
    }

    public void imprimir(){
        System.out.println("cor = " + cor);
        if (this.porta1 == 1){
            System.out.println("porta1 = aberta");
        }else {
            System.out.println("porta1 = fechada");
        }
        if (this.porta2 == 1){
            System.out.println("porta2 = aberta");
        }else {
            System.out.println("porta2 = fechada");
        }
        if (this.porta3 == 1){
            System.out.println("porta3 = aberta");
        }else {
            System.out.println("porta3 = fechada");
        }
        System.out.println("----------------------------");
        System.out.println("");
    }

}

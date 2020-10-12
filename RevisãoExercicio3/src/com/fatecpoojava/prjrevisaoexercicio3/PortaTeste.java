package com.fatecpoojava.prjrevisaoexercicio3;

public class PortaTeste {

    public static void main(String[] args) {
	// write your code here
        Porta porta1 = new Porta();
        porta1.setDimensaoX(1.2);
        porta1.setDimensaoY(2.3);
        porta1.setDimensaoZ(0.05);
        porta1.abre();
        porta1.imprimir();
        porta1.pinta();
        porta1.imprimir();
        porta1.alterarDimensao();
        porta1.imprimir();
        porta1.alterarDimensao();
        porta1.imprimir();
        porta1.alterarDimensao();
        porta1.imprimir();
        porta1.pinta();
        porta1.fecha();
        porta1.imprimir();
    }
}

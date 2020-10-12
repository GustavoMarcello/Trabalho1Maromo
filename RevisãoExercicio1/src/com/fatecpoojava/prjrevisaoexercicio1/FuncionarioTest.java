package com.fatecpoojava.prjrevisaoexercicio1;

import java.util.Scanner;

public class FuncionarioTest {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario1 = new Funcionario();
        System.out.println("Digite o id do funcionario: ");
        funcionario1.setIdFunc(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o nome do funcionario: ");
        funcionario1.setNomeFunc(sc.nextLine());
        System.out.println("Digite o departamento do funcionario: ");
        funcionario1.setDepartamento(sc.nextLine());
        System.out.println("Digite o Salario do funcionario: ");
        funcionario1.setSalario(Double.parseDouble(sc.nextLine()));
        System.out.println("Digite o documento do funcionario: ");
        funcionario1.setDocumento(sc.nextLine());
        funcionario1.imprimir();
        funcionario1.demiteFuncionario();
        funcionario1.imprimir();
        funcionario1.atualizarSalario();
        funcionario1.imprimir();

    }
}

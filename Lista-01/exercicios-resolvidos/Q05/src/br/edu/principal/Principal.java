package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario, porcentagem, novo_salario, aumento;
		System.out.print("Qual o salário do funcionario? ");
		salario = sc.nextDouble();
		System.out.print("Qual o percentual do aumento do salário? ");
		porcentagem = sc.nextDouble();
		aumento = salario * porcentagem/100;
		System.out.println("Teve um aumento de " + aumento + " reais");
		novo_salario = salario + aumento;
		System.out.print("O novo salário do funcionario é " + novo_salario);

	}

}

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salario, novo_salario;
		System.out.print("Qual o salário do funcionário? ");
		salario = sc.nextDouble();
		novo_salario = salario + salario * 25/100;
		System.out.print("O novo salário do funcionário é " + novo_salario);

	}

}

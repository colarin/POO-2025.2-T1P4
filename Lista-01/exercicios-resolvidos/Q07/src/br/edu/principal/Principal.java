package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double salario, salarioreceber, imposto;
		System.out.print("Qual o salário do funcionário? ");
		salario = sc.nextDouble();
		imposto = salario * 10/100;
		salarioreceber = salario + 50 - imposto;
		System.out.print("O total que o funcionário vai receber é " + salarioreceber);
	}
}

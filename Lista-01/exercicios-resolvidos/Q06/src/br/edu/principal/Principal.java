package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salario, salarioreceber, gratificacao, imposto;
		System.out.print("Qual o salário do funcionário? ");
		salario = sc.nextDouble();
		gratificacao = salario * 5/100;
		imposto = salario * 7/100;
		salarioreceber = salario + gratificacao - imposto;
		System.out.print("O total que o funcionário vai receber é " + salarioreceber);
		

	}

}

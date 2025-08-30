package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2, num3, multiplicacao;
		System.out.print("Qual o valor do primeiro número? ");
		num1 = sc.nextDouble();
		System.out.print("Qual o valor do segundo número? ");
		num2 = sc.nextDouble();
		System.out.print("Qual o valor do terceiro número? ");
		num3 = sc.nextDouble();
		multiplicacao = num1 * num2 * num3;
		System.out.print("O resultado desta multiplicação é  " + multiplicacao);
	}

}

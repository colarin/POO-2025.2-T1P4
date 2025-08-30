package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2, subtracao;
		System.out.print("Qual o valor no primeiro número? ");
		num1 = sc.nextDouble();
		System.out.print("Qual o valor do segundo número? ");
		num2 = sc.nextDouble();
		subtracao = num1 - num2;
		System.out.print("O valor da subtração é " + subtracao);

	}

}

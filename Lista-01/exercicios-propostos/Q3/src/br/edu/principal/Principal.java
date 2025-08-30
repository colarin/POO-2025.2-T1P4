package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2, divisao;
		System.out.print("Qual o valor do primeiro número? ");
		num1 = sc.nextDouble();
		System.out.print("Qual o valor do segundo número? ");
		num2 = sc.nextDouble();
		if (num2 == 0) {
			System.out.print("O valor do segundo número tem que ser diferente de zero!");
		}
		else {
			divisao = num1 / num2;
			System.out.print("O resultado da divisão é " + divisao);
		}
	}

}

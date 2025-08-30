package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, media;
		System.out.print("Qual o valor da primeira nota? ");
		n1 = sc.nextDouble();
		System.out.print("Qual o valor da segunda nota? ");
		n2 = sc.nextDouble();
		media = (n1 * 2 + n2 * 3)/5;
		System.out.print("A media do aluno é " + media);
	}

}

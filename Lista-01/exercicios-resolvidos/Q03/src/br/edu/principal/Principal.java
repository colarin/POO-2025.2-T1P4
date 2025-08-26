package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3, peso1, peso2, peso3, media;
		System.out.print("Qual a primeira nota? ");
		n1 = sc.nextDouble();
		System.out.print("Qual o peso da nota? ");
		peso1 = sc.nextDouble();
		System.out.print("Qual a segunda nota? ");
		n2 = sc.nextDouble();
		System.out.print("Qual o peso da nota? ");
		peso2 = sc.nextDouble();
		System.out.print("Qual a terceira nota? ");
		n3 = sc.nextDouble();
		System.out.print("Qual o peso da nota? ");
		peso3 = sc.nextDouble();
		media = (n1 * peso1 + n2 * peso2 + n3 * peso3)/3;
		System.out.print("A nota do aluno é " + media);
	}

}

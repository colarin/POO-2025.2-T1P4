package br.edu.principal;

import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, n3, media;
		System.out.print("Qual o primeiro número? ");
		n1 = sc.nextDouble();
		System.out.print("Qual o segundo número? ");
		n2 = sc.nextDouble();
		System.out.print("Qual o terceiro número? ");
		n3 = sc.nextDouble();
		media = (n1 + n2 + n3) / 3;
		System.out.print("A media do aluno é " + media);
		
	}
}

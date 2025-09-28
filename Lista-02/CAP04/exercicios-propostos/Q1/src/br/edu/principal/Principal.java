package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3, n4, media;
		
		System.out.print("Qual a primeira nota do aluno: ");
		n1 = sc.nextDouble();
		System.out.print("Qual a segunda nota do aluno: ");
		n2 = sc.nextDouble();
		System.out.print("Qual a terceira nota do aluno: ");
		n3 = sc.nextDouble();
		System.out.print("Qual a quarta nota do aluno: ");
		n4 = sc.nextDouble();
		
		media = (n1 + n2 + n3 + n4)/4;
		System.out.println("A média aritmética do aluno é: " + media);
		if(media >= 7) {
			System.out.println("Aprovado");
		}
		else {
			System.out.println("Reprovado");
		}

	}

}

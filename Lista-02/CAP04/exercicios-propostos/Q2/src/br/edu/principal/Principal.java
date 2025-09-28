package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, media;
		
		System.out.print("Qual a primeira nota do aluno: ");
		n1 = sc.nextDouble();
		System.out.print("Qual a segunda nota do aluno: ");
		n2 = sc.nextDouble();
		
		media = (n1 + n2)/2;
		System.out.println("A média aritmética do aluno é: " + media);
		if(media >= 7 & media <= 10) {
			System.out.println("Aprovado");
		}
		else if (media >= 3 & media < 7){
			System.out.println("Exame");
		}
		else if(media < 3) {
			System.out.println("Reprovado");
		}
	}
}

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3, media, nota_exame;
		System.out.print("Qual a primeira nota? ");
		n1 = sc.nextDouble();
		
		System.out.print("Qual a segunda nota? ");
		n2 = sc.nextDouble();
		
		System.out.print("Qual a terceira nota? ");
		n3 = sc.nextDouble();
		media = (n1 + n2 + n3) / 3;
		System.out.println("Média aritmética " + media);
		if (media >= 0 & media < 3) {
			System.out.println("REPROVADO!");
		}
		else if (media >= 3 & media < 7) {
			System.out.println("Exame");
			nota_exame = 12 - media;
			System.out.println("Deve tirar nota " + nota_exame + " para ser aprovado");
		}
		else if(media >= 7 & media <= 10) {
			System.out.println("APROVADO");
		}
		
	}

}

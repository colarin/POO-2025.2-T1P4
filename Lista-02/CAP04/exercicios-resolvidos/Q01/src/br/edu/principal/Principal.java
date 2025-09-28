package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double nota_trabalho, nota_avaliacao, nota_exame, media;
		
		System.out.print("Qual a nota do trabalho? ");
		nota_trabalho = sc.nextDouble();
		
		System.out.print("Qual a nota da avaliação? ");
		nota_avaliacao = sc.nextDouble();
		
		System.out.print("Qual a nota do exame? ");
		nota_exame = sc.nextDouble();
		
		media = (nota_trabalho * 2 + nota_avaliacao * 3 + nota_exame * 5)/10;
		System.out.println("Média ponderada: " + media);
		
		if(media >= 8 & media <= 10) {
			System.out.println("Obteve conceito A");
		}
		else if (media >= 7 & media < 8){
			System.out.println("Obteve conceito B");
		}
		else if (media >= 6 & media < 7) {
			System.out.println("Obteve conceito C");
		}
		else if (media >= 5 & media < 6) {
			System.out.println("Obteve conceito D");
		}
		else {
			System.out.println("Obteve conceito E");
		}
	}

}

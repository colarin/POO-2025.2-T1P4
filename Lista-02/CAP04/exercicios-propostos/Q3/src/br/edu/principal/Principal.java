package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n1, n2;
		
		System.out.print("Qual o primeiro número? ");
		n1 = sc.nextDouble();
		System.out.print("Qual o segundo número? ");
		n2 = sc.nextDouble();
		
		if(n1 > n2) {
			System.out.println("O número " + n1 + " é maior que " + n2);
			
		}
		else if(n2 > n1) {
			System.out.println("O número " + n2 + " é maior que " + n1);
		}
		else {
			System.out.println("Os números " + n1 + " e "  + n2 + " são iguais");
		}
	}

}

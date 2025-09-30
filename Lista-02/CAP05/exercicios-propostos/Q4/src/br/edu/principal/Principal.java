package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.print("Qual número você deseja a tabuada: ");
		numero = sc.nextInt();
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + numero * i);
	
		}
	}	
}

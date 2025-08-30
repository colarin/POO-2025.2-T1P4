package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double preco, novopreco, desconto;
		System.out.print("Qual o valor do produto? ");
		preco = sc.nextDouble();
		desconto = preco * 10/100;
		novopreco = preco - desconto;
		System.out.print("O novo preço do produto é " + novopreco);

	}

}

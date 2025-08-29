package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double deposito, taxa, rendimento, total;
		System.out.print("Qual o valor do depósito? ");
		deposito = sc.nextDouble();
		System.out.print("Qual o valor da taxa? ");
		taxa = sc.nextDouble();
		rendimento = deposito * taxa/100;
		total = deposito + rendimento;
		System.out.print("O depósito teve um rendeimento de " + rendimento);
		System.out.print("O valor total ficou " + total);
				
				
	}

}

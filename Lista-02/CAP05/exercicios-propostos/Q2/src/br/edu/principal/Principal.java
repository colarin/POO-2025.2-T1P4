package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double preco_ingresso, venda_ingresso, lucro_max;
		
		venda_ingresso = 120;
		
		for (preco_ingresso = 5; preco_ingresso >= 1; preco_ingresso -= 0.5) {
			lucro_max = (preco_ingresso * venda_ingresso) - 200;
			System.out.println("Preço do ingresso: R$" + preco_ingresso);
			System.out.println("Lucro máximo: " + lucro_max);
			System.out.println("Qtd de ingressos vendidos: " + venda_ingresso + "\n");
			venda_ingresso += 26;
		}
	}
}

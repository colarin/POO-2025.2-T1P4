package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, num, i, j, fat;
		System.out.print("Digite o valor de 'n': ");
		n = sc.nextInt();
		
		for (i = 1; i <= n; i++) {
			System.out.print("Digite um número: ");
			num = sc.nextInt();
			fat = 1;
			for (j = 1; j <= num; j++) {
				fat = fat * j;
			}
			System.out.printf("Valor do fatorial de %d é de: %d\n", num, fat);
		}
	}

}

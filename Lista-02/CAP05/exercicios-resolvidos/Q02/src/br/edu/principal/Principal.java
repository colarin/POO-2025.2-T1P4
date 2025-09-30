package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, e, i, j, fat;
		System.out.print("Digite o valor de 'n': ");
		n = sc.nextInt();
		e = 1;
		for (i = 1; i <= n; i ++) {
			fat = 1;
			for (j = 1; j <= i; j ++) {
				fat = fat * j;
			}
			e = e + 1/fat;
		}
		System.out.printf("Valor de 'e' -> %d", e);

		
	}

}

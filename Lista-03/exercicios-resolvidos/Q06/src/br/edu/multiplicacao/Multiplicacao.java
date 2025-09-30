package br.edu.multiplicacao;

public class Multiplicacao {
	public static void multiplicacao(int n) {
		int i, j;
		for (i = 1; i <= n; i ++) {
			for (j = 1; j <= i; j ++) {
				System.out.println(i * j);
			}
		}
	}
}

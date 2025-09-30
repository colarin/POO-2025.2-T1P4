package br.edu.somar;

public class Somar {
	public static int somar(int num1, int num2) {
		int i, s;
		s = 0;
		for (i = num1 + 1; i <= num2 - 1; i ++) {
			s += i;
		}
		return s;
	}
}

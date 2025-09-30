package br.edu.verifica;

public class Verifica {
	public static int verifica(double num) {
		int res;
		if (num >= 0) {
			res = 0;
		} else {
			res = 1;
		}
		return res;
	}
}

package br.edu.dividir;

public class Divisores {
	public static int divisores(int a, int b, int c) {
		int i, s, r;
		s = 0;
		for (i = b; i <= c; i ++) {
			r = i % a;
			if ( r == 0 ) {
				s += i;
			}
		}
		return s;
	}

}

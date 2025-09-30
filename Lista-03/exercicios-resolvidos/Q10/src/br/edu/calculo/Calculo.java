package br.edu.calculo;

public class Calculo {
	public static double sequencia(int n) {
		double f, seq;
		
		seq = 1;
		for(int a = 1; a <= n; a++) {
			f = 1;
			for(int b = 1; b <= a; b++) {
				f = f * b;
			}
			seq = seq + 1 /f;
		}
		return seq;
	}
}

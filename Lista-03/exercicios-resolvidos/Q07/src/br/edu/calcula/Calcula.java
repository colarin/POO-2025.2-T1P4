package br.edu.calcula;

public class Calcula {
	public static double calcula_media(double n1, double n2, double n3, char l) {
		double media;
		if (l == 'a') {
			media = (n1+n2+n3) / 3;
		} else {
			media = (n1 * 5 + n2 * 3 + n3  * 2) / (5+3+2);
		}
		return media;
	}
}

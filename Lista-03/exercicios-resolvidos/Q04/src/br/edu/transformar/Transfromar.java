package br.edu.transformar;

public class Transfromar {
	public static void transformacao( int segundos ) {
		int h, m, s, r;
		h = segundos / 3600;
		r = segundos % 3600;
		m = r / 60;
		s = r % 60;
		System.out.println(h + " hora(s), " + m + " minuto(s), " + s + " segundo(s)");
	}
}

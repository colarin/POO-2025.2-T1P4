package br.edu.reajuste;

public class Reajuste {
	public static double calculo_reajuste(double PA, double PN) {
		double result;
		result = (100 * PN - 100 * PA) / PA;
		return result;
	}
}

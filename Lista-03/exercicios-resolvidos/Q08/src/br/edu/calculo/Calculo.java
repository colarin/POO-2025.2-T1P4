package br.edu.calculo;

public class Calculo {

	public static int calculo(int hora_i, int min_i, int hora_f, int min_f){
		int tot_h, tot_m, total;
		if (min_f < min_i){
			min_f = min_f + 60;
			hora_f = hora_f - 1;
		}
		if(hora_f < hora_i) {
			hora_f = hora_f + 24;
		}
		
		tot_m = min_f - min_i;
		tot_h = hora_f - hora_i;
		total = tot_h * 60 + tot_m;
		return total;
	}

}

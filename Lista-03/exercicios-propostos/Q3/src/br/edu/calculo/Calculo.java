package br.edu.calculo;

public class Calculo {
	 public static int divisaodenumeros(int num1, int num2) {
	        if (num1 % num2 == 0) {
	            return 0;
	        } else {
	            int proximoDivisor = num1 + 1;
	            while (proximoDivisor % num2 != 0) {
	                proximoDivisor++;
	            }
	            return proximoDivisor;
	        }
	    }
}

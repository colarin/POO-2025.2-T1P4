package br.edu.principal;

import java.util.Scanner;
import br.edu.calculo.Calculo;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		double s;
		System.out.print("Digite um valor para n: ");
		num = sc.nextInt();
		s = Calculo.sequencia(num);
		System.out.print(s);
	}

}

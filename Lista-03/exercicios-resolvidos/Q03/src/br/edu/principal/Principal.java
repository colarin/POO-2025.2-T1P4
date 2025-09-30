package br.edu.principal;

import java.util.Scanner;
import br.edu.dividir.Divisores;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, result;
		do {
			System.out.print("Valor para 'a': ");
			a = sc.nextInt();
		} while (a <= 1);
		System.out.print("Valor para 'b': ");
		b = sc.nextInt();
		System.out.print("Valor para 'c': ");
		c = sc.nextInt();
		result = Divisores.divisores(a, b, c);
		
		System.out.println("Soma dos inteiros = " + result);
	}

}

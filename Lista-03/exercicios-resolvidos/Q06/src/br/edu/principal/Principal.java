package br.edu.principal;

import java.util.Scanner;
import br.edu.multiplicacao.Multiplicacao;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.print("Digite um número positivo: ");
			num = sc.nextInt();
		} while (num <= 1 & num >= 9);
		Multiplicacao.multiplicacao(num);
	}
}



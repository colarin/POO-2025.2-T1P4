package br.edu.principal;

import java.util.Scanner;
import br.edu.calculo.Calculo;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um valor para n: ");
		int n  = sc.nextInt();
		
		int resultado_soma = Calculo.somadenumeros(n);
		System.out.println("A soma dos números é: " + resultado_soma);
	}

}

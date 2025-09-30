package br.edu.principal;

import java.util.Scanner;
import br.edu.somar.Somar;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, s;
		System.out.print("Digite um número: ");
		num1 = sc.nextInt();
		
		System.out.print("Digite outro número: ");
		num2 = sc.nextInt();
		
		s = Somar.somar(num1, num2);
		System.out.println("Soma = " + s);
		
	}

}

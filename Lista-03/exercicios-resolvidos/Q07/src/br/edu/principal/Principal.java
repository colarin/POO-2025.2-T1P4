package br.edu.principal;

import java.util.Scanner;
import br.edu.calcula.Calcula;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota1, nota2, nota3, m;
		char letra;
		System.out.print("Nota 1: ");
		nota1 = sc.nextDouble();
		
		System.out.print("Nota 2: ");
		nota2 = sc.nextDouble();
		
		System.out.print("Nota 3: ");
		nota3 = sc.nextDouble();
		
		do {
			System.out.print("Tipo de média: ");
			letra = sc.next().toLowerCase().charAt(0);
			
		} while (letra != 'a' && letra != 'p');
		
		m = Calcula.calcula_media(nota1, nota2, nota3, letra);
		if (letra == 'a') {
			System.out.print("A média aritmética: " + m);
		} else {
			System.out.print("A média ponderada: " + m);
		}
	}

}

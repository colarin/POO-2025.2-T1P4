package br.edu.principal;

import java.util.Scanner;
import br.edu.calculo.Calculo;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio da esfera: ");
        double raio = sc.nextDouble();

        double volume = Calculo.calcular(raio);
        System.out.println("O volume da esfera é: " + volume);
	}	
}

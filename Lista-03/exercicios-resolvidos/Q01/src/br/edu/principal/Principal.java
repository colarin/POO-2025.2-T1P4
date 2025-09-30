package br.edu.principal;

import java.util.Scanner;
import br.edu.verifica.Verifica;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num, x;
        System.out.print("Digite um número: ");
        num = sc.nextDouble();
        x = Verifica.verifica(num);
        
        if (x == 0) {
        	System.out.println("Número positivo");
        } else {
        	System.out.println("Número negativo");
        }
	
	}

}

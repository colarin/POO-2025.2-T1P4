package br.edu.principal;

import java.util.Scanner;
import br.edu.verificar.Verificar;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Digite um número inteiro: ");
	        int num = sc.nextInt();

	        Verificar.verificar(num);
	}

}

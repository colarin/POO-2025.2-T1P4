package br.edu.principal;

import java.util.Scanner;
import br.edu.transformar.Transfromar;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int seg;
		System.out.print("Digite um valor em segundos: ");
		seg = sc.nextInt();
		Transfromar.transformacao(seg);
	}

}

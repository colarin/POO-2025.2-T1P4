package br.edu.principal;

import java.util.Scanner;
import br.edu.reajuste.Reajuste;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double precoantigo, precoatual, acrescimo;
		System.out.print("Valor antigo: R$");
		precoantigo = sc.nextDouble();
			
		System.out.print("Valor atual: R$");
		precoatual = sc.nextDouble();
			
		acrescimo = Reajuste.calculo_reajuste(precoantigo, precoatual);
		System.out.println("Porcentagem de acréscimo: "+ acrescimo + "%");

	}

}

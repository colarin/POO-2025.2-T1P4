package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont, cod, num_vei = 0, num_acid = 0;
		int maior, cid_maior = 0, menor, cid_menor = 0;
		double media_vei, soma_vei, media_acid;
		double soma_acid, cont_acid;
		maior = 0;
		menor = 0;
		soma_vei = 0;
		soma_acid = 0;
		cont_acid = 0;
		for (cont = 1; cont <= 5; cont ++) {
			System.out.print("Digite o código da cidade: ");
			cod = sc.nextInt();
			
			System.out.print("Números de veículos de passeio: ");
			num_vei = sc.nextInt();
			
			System.out.print("Número de acidentes de trânsito com vítimas: ");
			num_acid = sc.nextInt();
			
			if (cont == 1) {
				maior = num_acid;
				cid_maior = cod;
				menor = num_acid;
				cid_menor = cod;
			} else {
				if (num_acid > maior) {
					maior = num_acid;
					cid_maior = cod;
				} 
				if (num_acid < menor) {
					menor = num_acid;
					cid_menor = cod;
				}
			}
			soma_vei += num_vei;
			if (num_vei < 2000) {
				soma_acid += num_acid;
				cont_acid += 1;
			}
		}
		System.out.println("Maior indíce de acidentes: " + maior + ", Código da cidade " + cid_maior);
		System.out.println("Menor indíce de acidentes: " + menor + ", Código da cidade " + cid_menor);
		media_vei = soma_vei / 5;
		System.out.println("Média de veículos: " + media_vei);
		if (cont_acid == 0) {
			System.out.println("Não foi digitada nenhuma cidade com menor de 2000 veículos");
		} else {
			media_acid = soma_acid / cont_acid;
			System.out.println("Média de acidentes com menos de 2000 veículos de passeio: " + media_acid);
		}
		
	}

}

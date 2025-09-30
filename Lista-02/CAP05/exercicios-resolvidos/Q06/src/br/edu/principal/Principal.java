package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cont, codigo = 0, nht, valor;
		double sal_min, sal_inicial, aux, sal_final;
		char turno, categoria;
		sal_min = 450;
		for (cont = 1; cont <= 10; cont ++) {
			System.out.print("Digite o código: ");
			codigo = sc.nextInt();
			
			System.out.print("Digite o número de horas trabalhadas: ");
			nht = sc.nextInt();
			
			System.out.print("Turno: ");
			turno = sc.next().toLowerCase().charAt(0);
			
		
			while (turno != 'm' & turno != 'v' & turno != 'n') {
				System.out.print("Turno: ");
				turno = sc.next().toLowerCase().charAt(0);
			}
			
			System.out.print("Categoria: ");
			categoria = sc.next().toLowerCase().charAt(0);
			
			while (categoria != 'g' & categoria != 'o') {
				System.out.print("Categoria: ");
				categoria = sc.next().toLowerCase().charAt(0);
			}
			
			if (categoria == 'g') {
				if (turno == 'n') {
					valor = sal_min * (18.0/100);
					
				} else {
					valor = sal_min * (10.0/100);
				}
			} else {
				if (turno == 'n') {
					valor = sal_min * (13.0/100);
				} else {
					valor = sal_min * (10.0/100);
				}
			}
			sal_inicial = nht * valor;
			if (sal_inicial <= 300) {
				aux = sal_inicial * (20.0/100);
			} else if (sal_inicial < 600) {
				aux = sal_inicial * (15.0/100);
			} else {
				aux = sal_inicial * (5.0/100);
			}
			
			sal_final = sal_inicial + aux;
			System.out.println("Código: " + codigo);
			System.out.println("Número de horas trabalhadas: " + nht);
			System.out.println("Valor da hora trabalhada: " + valor);
			System.out.println("Sálario inicial: " + sal_inicial);
			System.out.println("Auxílio alimentação: " + aux);
			System.out.println("Salário final: " + sal_final);
		}
		
	}

}

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2, resultado, op;
		
		System.out.println("----MENU----");
		System.out.println("1- Média entre os números");
		System.out.println("2- Diferença entre o maior e o menor");
		System.out.println("3- Produto dos números");
		System.out.println("4- Divisão do primeiro pelo segundo");
		System.out.print("Escolha uma opção: ");
		op = sc.nextDouble();
		
		System.out.println("------------");
		
		System.out.println("Qual o valor do primeiro número? ");
		num1 = sc.nextDouble();
		System.out.println("Qual o valor do segundo número? ");
		num2 = sc.nextDouble();
		
		if(op == 1) {
			resultado = (num1 + num2)/2;
			System.out.println("A média dos dois números é: " + resultado);
		}
		else if(op == 2) {
			if(num1 >= num2) {
				resultado = num1 - num2;
				System.out.println("A diferença entres eles é de " + resultado);
			}
			else if(num2 >= num1) {
				resultado = num2 - num1;
				System.out.println("A diferença entres eles é de " + resultado);
			}
		}
		else if(op == 3) {
			resultado = num1 * num2;
			System.out.println("O resultado da multiplicação é " + resultado);
		}
		else if(op == 4) {
			if(num2 == 0) {	
				System.out.println("O segundo número tem que ser diferente de 0");
			}
			else {
				resultado = num1 / num2;
				System.out.println("O resultado da divisão é " + resultado);
			}
		}
		else {
			System.out.println("A opção escolhida é inválida ");
		}
	}

}

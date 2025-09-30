package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double idade, i1 = 0, i2 = 0, i3 = 0, i4 = 0, i5 = 0 , i6 = 0, i7 = 0, i8 = 0;
		for(int i = 0; i <= 8; i++) {
			System.out.print("Diga a sua idade: ");
			idade = sc.nextDouble();
			
			if(idade <= 15) {
				i1 ++;
			}
			else if(idade >= 16 && idade <= 30) {
				i2++;
			}
			else if(idade >= 31 && idade <= 45) {
				i3++;
			}
			else if(idade >= 46 && idade <= 60) {
				i4++;
			}
			else if(idade >= 60) {
				i5++;
			}
		}
		System.out.println("A Quantidade de pessoas na faixa etária 1° é " + i1);
		System.out.println("A Quantidade de pessoas na faixa etária 2° é " + i2);
		System.out.println("A Quantidade de pessoas na faixa etária 3° é " + i3);
		System.out.println("A Quantidade de pessoas na faixa etária 4° é " + i4);
		System.out.println("A Quantidade de pessoas na faixa etária 5° é " + i5);
		
		System.out.println("------------------------");
		System.out.println("A porcentagem de pessoas na 1° faixa etária é " + (i1/8)*100 + "%");
		System.out.println("A porcentagem de pessoas na 5° faixa etária é " + (i5/8)*100 + "%");
	}

}

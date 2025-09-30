package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 1; i <= 10; i++) {
			System.out.println("---------------");
			for(int j = 0; j <= 10; j++) {
				System.out.println(i + "x" + j + "=" + i*j);
			}
		}
		
		
	}

}

package br.edu.principal;

import  java.util.Scanner;
import br.edu.calculo.Calculo;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora_i, min_i, hora_f, min_f, minutos;
		
		System.out.print("Qual a hora inicial do jogo? ");
		hora_i = sc.nextInt();
		System.out.print("Qual o minuto inicial do jogo? ");
		min_i = sc.nextInt();
		System.out.print("Qual a hora final do jogo? ");
		hora_f = sc.nextInt();
		System.out.print("Qual o minuto final do jogo? ");
		min_f = sc.nextInt();
		
		minutos = Calculo.calculo(hora_i, min_i, hora_f, min_f);
		
		System.out.println(minutos);
		
	}

}

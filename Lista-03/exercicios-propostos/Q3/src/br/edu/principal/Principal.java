package br.edu.principal;

import java.util.Scanner;
import br.edu.calculo.Calculo;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        int resultado = Calculo.divisaodenumeros(num1, num2);
        System.out.println("Resultado: " + resultado);
	}

}

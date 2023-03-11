package aplicacao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * 1 - Escreva um programa que leia uma temperatura em graus Farenheit e a
		 * imprima em graus Centígrados. A conversão de graus Farenheit para Centígrados
		 * é obtida por C=(5/9)(F-32).
		 */

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Informe uma temperatura em graus Fahrenheit: ");
			double grausF = sc.nextDouble();

			double grausC = (grausF - 32) * 5 / 9;

			System.out.printf("%.2fF° equivalem à %.2fC°.", grausF, grausC);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

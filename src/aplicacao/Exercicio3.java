package aplicacao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		/*
		 * 3 - Faça um programa que leia o primeiro termo de uma Progressão Aritmética
		 * (PA), sua razão, um número N e, a seguir, calcule e mostre o N-ésimo termo da
		 * PA.
		 */

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Informe o primeiro termo da Progressão aritmética: ");
			int termo = sc.nextInt();
			System.out.print("Informe a razão: ");
			int razao = sc.nextInt();
			System.out.print("Informe um número N: ");
			int n = sc.nextInt();

			for (int i = 1; i <= n; i++) {
				termo += razao;
			}

			System.out.printf("O %dº termo é %d.", n, termo);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

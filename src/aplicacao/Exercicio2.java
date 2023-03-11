package aplicacao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		/*
		 * 2 - Escreva um programa que pergunte os seguintes dados referentes ao pneu de
		 * um automóvel:
		 * 
		 * P = pressão V = volume T = temperatura
		 * 
		 * e calcule a massa de ar desse pneu segundo a fórmula (M = massa de ar): PV =
		 * 0.37M(T+460)
		 * 
		 */

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Informe a pressão do pneu: ");
			double pressao = sc.nextDouble();
			System.out.print("Informe o volume: ");
			double volume = sc.nextDouble();
			System.out.print("Informe a temperatura do pneu: ");
			double temperatura = sc.nextDouble();

			double massa = (0.37 * (temperatura + 460)) / (pressao * volume);

			System.out.printf("A massa de ar do pneu é de %.2f.", massa);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

package application;

import java.util.Locale;
import java.util.Scanner;

public class VertorTeste {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe quantas Vezes Irão Digitar");
		int vezes = sc.nextInt();
		double[] alturas = new double[vezes];
		double mediaAltura = 0;

		for (int i = 0; i < vezes; i++) {

			System.out.print("Informe a Altura da posição " + i + " : ");
			alturas[i] = sc.nextDouble();

		}

		for (int i = 0; i < alturas.length; i++) {

			mediaAltura += alturas[i];

		}

		
		System.out.printf(" %.2f",mediaAltura / vezes);

		sc.close();
	}

}

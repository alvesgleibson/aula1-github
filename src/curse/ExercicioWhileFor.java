package curse;

import java.util.Scanner;

public class ExercicioWhileFor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int maior = 0;

		System.out.print("Informe um numero n�o negativo: ");
		int testaNumeroNegativo = sc.nextInt();

		while (testaNumeroNegativo < 0) {
			System.out.println("N�o pode Ser numero negativo");
			System.out.print("Informe outro Numero: ");
			testaNumeroNegativo = sc.nextInt();

		}

		for (int i = 1; i <= testaNumeroNegativo; i++) {

			System.out.print("Informe o " + i + " de " + testaNumeroNegativo + ": ");
			int numeroInternoFor = sc.nextInt();
			if (maior < numeroInternoFor) {
				maior = numeroInternoFor;
			}

		}

		System.out.println("Maior numero digitado " + maior);

		sc.close();
	}

}

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductVetor;

public class ProgramVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a Quantidade");
		int quantity = sc.nextInt();

		ProductVetor[] vetors = new ProductVetor[quantity];

		for (int i = 0; i < quantity; i++) {
			sc.nextLine();
			System.out.print("Informe o nome: ");
			String name = sc.nextLine();

			System.out.print("informe o Price: ");
			double price = sc.nextDouble();

			vetors[i] = new ProductVetor(name, price);

		}

		double soma = 0;
		for (int i = 0; i < quantity; i++) {

			soma += vetors[i].getPrice();

		}
		System.out.printf("Media de Preco %.2f", soma / quantity);

		sc.close();
	}

}

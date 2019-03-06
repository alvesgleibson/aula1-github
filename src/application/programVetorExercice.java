package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductVetorExecice;

public class programVetorExercice {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be retends? ");
		int namberRooms = sc.nextInt();

		ProductVetorExecice[] vetorRooms = new ProductVetorExecice[10];

		while (namberRooms > 10) {
			sc.nextLine();
			System.out.println("numero não pode ser maior que 10");
			System.out.print("How many rooms will be retends? ");
			namberRooms = sc.nextInt();
		}
		for (int i = 0; i < namberRooms; i++) {
			sc.nextLine();
			System.out.println();
			System.out.println("Rent #" + i);
			System.out.print("Name: ");
			String nameTemp = sc.nextLine();
			System.out.print("Email: ");
			String emailTemp = sc.nextLine();

			System.out.print("Namber Room entre: ");
			int manberTemp = sc.nextInt();

			vetorRooms[manberTemp - 1] = new ProductVetorExecice(nameTemp, emailTemp);
		}

		for (int i = 0; i < vetorRooms.length; i++) {

			if (vetorRooms[i] != null) {
				System.out.println("Busy Rooms: " + (i + 1) + ": " + vetorRooms[i]);
			}

		}

		sc.close();
	}

}

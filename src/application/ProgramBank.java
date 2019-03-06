package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContsBank;

public class ProgramBank {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double temValueHolder;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int tempNumberHolder = sc.nextInt();
		
		System.out.print("Enter account Holder: ");
		sc.nextLine();
		String tempNameholder = sc.nextLine();

		

		System.out.print("Is there na initial deposit (y/n)?: ");
		char confir = sc.next().charAt(0);

		ContsBank c1;

		if (confir == 'y') {
			System.out.print("Enter initial deposit value: ");
			temValueHolder = sc.nextDouble();
			c1 = new ContsBank(tempNameholder, tempNumberHolder, temValueHolder);

		} else {
			c1 = new ContsBank(tempNameholder, tempNumberHolder);
			System.out.println(c1);
		}

		System.out.print("Enter a deposit value: ");
		temValueHolder = sc.nextInt();
		c1.depositarValor(temValueHolder);

		System.out.print("Enter a Saque value: ");
		temValueHolder = sc.nextInt();
		c1.sacarValor(temValueHolder);

		sc.close();
	}

}

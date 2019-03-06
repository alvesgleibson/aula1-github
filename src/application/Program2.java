package application;

import java.util.Scanner;

import entities.Product2;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Product2 product2 = new Product2();

		System.out.print("Name: ");
		product2.name = sc.nextLine();

		System.out.print("Gross Salary: ");
		product2.grossSalary = sc.nextDouble();

		System.out.print("Tax: ");
		product2.tax = sc.nextInt();

		System.out.println("Employee: " + product2.name + " your Net Salary is: " + product2.NetSalary());

		System.out.print("Which percentage to increase Salary: ");
		double result = product2.IncreaseSalary(sc.nextDouble());

		System.out.println("Employee: " + product2.name + " your Net Salary plus increase: " + result);

		sc.close();
	}

}

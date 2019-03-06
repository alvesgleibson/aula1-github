package application;

import java.util.Scanner;

import entities.Student;

public class ProgramStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student a = new Student();
		System.out.print("Informe o nome: ");
		a.name = sc.nextLine();
		
		
		System.out.print("Informe a 1 nota ");
		a.nota1 = sc.nextDouble();
		
		System.out.print("Informe a 2 nota ");
		a.nota2 = sc.nextDouble();
		
		System.out.print("Informe a 3 nota ");
		a.nota3 = sc.nextDouble();
		
		
		
		a.passouOuNao();
		
		
		sc.close();
	}

}

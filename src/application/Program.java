package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		
		System.out.print("Informe a Altura do Retangulo: ");
		product.heigth = sc.nextDouble();
		System.out.print("informe a largura: ");
		product.width = sc.nextDouble();
		
		System.out.println("a area eh: "+product.area());
		System.out.println("the periment is: "+product.perimenter());
		
		
		
		
		sc.close();
	}

}

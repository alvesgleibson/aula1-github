package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.EmployeeArrayList;

public class ProgramEmployee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int times = sc.nextInt();
		List<EmployeeArrayList> employee = new ArrayList<EmployeeArrayList>();
		
		
		for (int i = 1; i <= times; i++) {
			System.out.println("Emplyoee #"+i+": ");
			System.out.print("ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			employee.add(new EmployeeArrayList(id, nome, salary));
		}
		
		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		
		//EmployeeArrayList emp = employee.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		//EmployeeArrayList emp = employee.stream().filter(x -> x.getId()== id).findFirst().orElse(null);
		
		//EmployeeArrayList emp = employee.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		EmployeeArrayList emp = employee.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (emp ==null) {
			System.out.println("This id does not exist!");
			
		}else {
			System.out.print("Enter the percentage: ");
			double porcentage = sc.nextDouble();
			emp.increaseSalary(porcentage);
		}
		

		
		
		
		System.out.println("List of employees:");
		for (EmployeeArrayList foremploid : employee) {
		
			System.out.println(foremploid);
		}
		
		
		
		
		
		
		sc.close();
	}

}

package entities;

public class Student {

	public String name;
	public double nota1, nota2, nota3;
	

	public double finalGrade() {
		return nota1+nota2+nota3;
	}
	
	public void passouOuNao() {
		if (finalGrade() >= 60) {
			System.out.println("Final Grade = " + finalGrade());
			System.out.println("Student Pass");

		} else {

			System.out.println("Final Grade = " + finalGrade());
			System.out.println("Failed");

			double result = (60 - finalGrade());
			System.out.println("Missing " + result + " Points");

		}

	}

}

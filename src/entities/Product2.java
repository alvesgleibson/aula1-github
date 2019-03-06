package entities;

public class Product2 {

	public String name;
	public double grossSalary;
	public int tax;

	public double NetSalary() {
		double receive = grossSalary;

		return receive -= tax;

	}

	public double IncreaseSalary(double percentage) {
		double receive = NetSalary();
		return (receive += ((percentage * 0.01) * grossSalary));

	}

}

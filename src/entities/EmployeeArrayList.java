package entities;


public class EmployeeArrayList {
	private int id;
	private String name;
	private double salary;
	public EmployeeArrayList(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void increaseSalary(double percentagem) {

		setSalary(salary+=(salary*(percentagem*0.01)));
		
	}
	
	
	@Override
	public String toString() {

		return getId()+", "+ getName()+", "+String.format("%.2f",getSalary());
	}
	
	

}

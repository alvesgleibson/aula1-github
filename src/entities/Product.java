package entities;

public class Product {
	public double width, heigth;
	
	public double area() {
		return width * heigth;
	}
	
	public double perimenter() {
		return 2*(width + heigth);
		
	}
	
	

}

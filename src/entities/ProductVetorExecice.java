package entities;

public class ProductVetorExecice {
	private String name;
	private String email;

	public ProductVetorExecice(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {

		return getName() + ", " + getEmail();
	}

}

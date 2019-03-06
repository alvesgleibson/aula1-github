package entities;

public class ContsBank {
	private String nome;
	private int namber;
	private double valorConta;


	public ContsBank(String nome, int namber, double inicialDeposito) {
		this.nome = nome;
		this.namber = namber;
		depositarValor(inicialDeposito);
	}

	public ContsBank(String nome, int namber) {
		this.nome = nome;
		this.namber = namber;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorConta() {
		return valorConta;
	}

	public int getNamber() {
		return namber;
	}

	public void depositarValor(double valor) {

		valorConta += valor;
		System.out.println(toString());
	}

	public void sacarValor(double valor) {
		valorConta -= (valor + 5);
		System.out.println(toString());

	}

	@Override
	public String toString() {

		return "Accont " + getNamber() + ", Holder: " + getNome() + ", Balance: "
				+ String.format("%.2f", getValorConta());
	}

}

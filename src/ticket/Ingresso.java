package ticket;

public class Ingresso {
	private String tipo;
	private double preco;
	private int qntd;
	private int limite;
	
	public Ingresso(String tipo, double preco, int qntd, int limite) {
		this.tipo = tipo;
		this.preco = preco;
		this.qntd = qntd;
		this.limite = limite;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQntd() {
		return qntd;
	}

	public void setQntd(int qntd) {
		this.qntd = qntd;
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}



}

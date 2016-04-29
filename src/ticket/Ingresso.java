package ticket;

public class Ingresso {
	private String tipo;
	private double preco;
	private int qntd;
	private int limite;
	private int id;
	
	public Ingresso(String tipo, double preco, int qntd, int limite, int id) {
		this.tipo = tipo;
		this.preco = preco;
		this.qntd = qntd;
		this.limite = limite;
		this.id = id;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String toString() {
		return "Ingresso [tipo=" + tipo + ", preco=" + preco + ", qntd=" + qntd + ", limite=" + limite + ", id=" + id
				+ "]";
	}




}
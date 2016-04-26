package ticket;

import java.util.Date;

public class Eventos {
	
	private Ingresso ingressos[];
	private String nome;
	private String rua;
	private String cidade;
	private String estado;
	private String descricao;
	private String hora;
	private Date data;
	
	public Eventos(String nome, String rua, String cidade, String estado,
			String descricao, String hora, Date data) {
		super();
		this.nome = nome;
		this.rua = rua;
		this.cidade = cidade;
		this.estado = estado;
		this.descricao = descricao;
		this.hora = hora;
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	} 
	
	
	
	
	

}

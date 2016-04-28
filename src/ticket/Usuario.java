package ticket;


public class Usuario {
	private String nome; 
	private String rua;
	private String cidade;
	private String estado;
	private String email;
	private String cpf;
	private String senha;
	private String sexo;
	
	
	
	public Usuario(String nome, String rua, String cidade, String estado,
			String email, String cpf, String senha, String sexo) {
		this.nome = nome;
		this.rua = rua;
		this.cidade = cidade;
		this.estado = estado;
		this.email = email;
		this.cpf = cpf;
		this.senha = senha;
		this.sexo = sexo;
	}

	
	

	public String toString() {
		return "Usuario \nNome=" + nome + "\nRua=" + rua + "\nCidade=" + cidade
				+ "\nEstado=" + estado + "\nEmail=" + email + "\nCPF=" + cpf
				+ "\nSenha=" + senha + "\nSexo=" + sexo;
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



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getSenha() {
		return senha;
	}



	public void setSenha(String senha) {
		this.senha = senha;
	}



	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package controladores;

import dados.RepositorioUsuario;

public class ControladorUsuarios {
	private RepositorioUsuario repositorios;

	public ControladorUsuarios() {
		this.repositorios = new RepositorioUsuario();
	}

	public void validarLogin(String cpf,String senha){
	
			if(repositorios.buscarUsuario(cpf)!= null){
				if(repositorios.buscarUsuario(cpf).getSenha()!=senha){
					System.out.println("Senha Incorreta");
				}else{
					System.out.println(repositorios.buscarUsuario(cpf).toString());
				}

			}else{
				System.out.println("Usuario não existe");
			}
		
	}








}

package dados;

import ticket.Usuario;

public class RepositorioUsuario {
	
	private Usuario usuarios[];

	public RepositorioUsuario() {

		this.usuarios = new Usuario[101];
	}
	
	public void inserirUsuario(Usuario usu){
		for(int i =0;i<this.usuarios.length;i++){
			if(this.usuarios[i]==null){
				this.usuarios[i]=usu;
				break;
			}
		}
	}
	
	public Usuario buscarUsuario(String cpf){
	
		
		int i=0;
			while(this.usuarios[i].getCpf()!=cpf){
				if(this.usuarios[i].getCpf().equals(cpf)){
				
					return this.usuarios[i];
			}else{
				i++;
			}
		}
			
		return null;
	}
	
	public void removerUsuario(Usuario usu){
		
		for(int i=0;i<this.usuarios.length;i++){
			if(this.usuarios[i].equals(usu)){
				this.usuarios[i]=null;
				break;
			}
		}
		System.out.println("Usuário Inexistente");
	}
	
	
	
}

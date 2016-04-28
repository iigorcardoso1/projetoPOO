package dados;

import ticket.Usuario;

public class RepositorioUsuario {

	private Usuario usuarios[];
	int ult=-1;
	public RepositorioUsuario() {

		this.usuarios = new Usuario[101];
	}

	
	
	
	public void inserirUsuario(Usuario usu){
		for(int i =0;i<this.usuarios.length;i++){
			if(this.usuarios[i]==null){
				this.usuarios[i]=usu;
				ult=i;
				break;
			}
		}
	}

	public Usuario buscarUsuario(String cpf){
		Usuario aux = null;
		if(cpf!=null){
			for(int i=0;i<this.usuarios.length;i++){
				if(this.usuarios[i] != null){
					if(this.usuarios[i].getCpf().equals(cpf)) {
						aux=this.usuarios[i];
						break;
					}
				}
			}
		}
		if(aux==null){
			System.out.println("Usuario Inexistente");
		}
		return aux;
	}//se tiver usuario retorna null

	public boolean removerUsuario(Usuario usu){
		boolean aux=false;
		Usuario r;
		if(usu!=null){
			if(ult==-1){
				System.out.println("Nenhum usu�rio Cadastrado");
			}else if(ult==0){
				this.usuarios[ult]=null;
				ult-=1;
			}else{

				for(int i=0;i<this.usuarios.length;i++){
					if(this.usuarios[i].equals(usu)){
						this.usuarios[i]=this.usuarios[ult];
						this.usuarios[ult]=null;
						aux=true;
						break;
					}
				}
			}
		}
		return aux;
	}//se remover aux = true, se n�o aux = false

	public boolean atualizaUsuario(Usuario usu){
		boolean aux=removerUsuario(usu);
		if(aux){
			inserirUsuario(usu);
		}

		return aux;
	}//se remover retorna true, se n�o remover retorna false





}

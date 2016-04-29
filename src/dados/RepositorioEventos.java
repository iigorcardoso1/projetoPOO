package dados;

import ticket.Eventos;
import ticket.Ingresso;

public class RepositorioEventos {
	private Eventos eventos[];
	int ultimo=-1;
	public RepositorioEventos(){
		this.eventos = new Eventos[100];
	}


	public void inserirEvento(Eventos evt){
		for(int i = 0;i<eventos.length;i++){
			if(this.eventos[i]== null){
				this.eventos[i]= evt;
				ultimo = i;
				break;
			}
		}
	}

	public Eventos buscarEvento(int id){
		Eventos aux = null;
		if(id!= 0){
			for(int i=0;i<eventos.length;i++){
				if(this.eventos[i]!= null){
					if(this.eventos[i].getId()== id){
						aux = this.eventos[i];
						break;
					}
				}
			}

		}
		return aux;
	}

	public boolean removerEvento(int id){
		boolean aux = false;
		if(id != 0){
			if(ultimo == -1){
				System.out.println("Nenhum ingresso cadastrado");
			}else if(ultimo == 0){
				this.eventos[ultimo]= null;
				ultimo-=1;
			}else{
				for(int i=0;i<eventos.length;i++){
					if(this.eventos[i].getId()== id){
						this.eventos[i]= this.eventos[ultimo];
						this.eventos[ultimo]= null;
						aux = true;
						break;
					}
				}
			}
		}
		return aux;
	}

	public boolean atualizarEvento(Eventos evt){
		boolean aux= removerEvento(evt.getId());
		if(aux){
			inserirEvento(evt);
		}
		return aux;

	}
}
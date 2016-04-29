package dados;

import ticket.Ingresso;

public class RepositorioIngresso {
     private Ingresso ingressos[];
     int ultimo=-1;
     public RepositorioIngresso(){
    	 this.ingressos = new Ingresso[100];
     }


public void inserirIngresso(Ingresso ing){
	for(int i = 0;i<this.ingressos.length;i++){
		if(this.ingressos[i]== null){
			this.ingressos[i]=ing;
			ultimo = i;
			break;
		}
	}
}

public Ingresso buscarIngresso(int id){
	Ingresso aux=null;
	if(id!= 0){
		for(int i = 0;i<this.ingressos.length;i++){
			if(this.ingressos[i]!= null){
				if(this.ingressos[i].getId() == id){
					aux=this.ingressos[i];
					break;
				}
			}
		}
	}
	if(aux == null){
		System.out.println("Ingresso inexistente");
	}
	return aux;
}

public boolean removerIngresso(int id){
	boolean aux= false;
	if(id != 0){
		if(ultimo == -1){
			System.out.println("Nenhum ingresso cadastrado");
		}else if(ultimo == 0){
			this.ingressos[ultimo]= null;
			ultimo-=1;
		}else{
			for(int i=0;i<this.ingressos.length;i++){
				if(this.ingressos[i].getId()== id){
					this.ingressos[i]= this.ingressos[ultimo];
					this.ingressos[ultimo]= null;
					aux = true;
					break;
				}
			}
		}
	}
	return aux;
}

public boolean atualizarIngresso(Ingresso ing){
    boolean aux= removerIngresso(ing.getId());
     if(aux){
    	 inserirIngresso(ing);
     }
    return aux;
    
}
}
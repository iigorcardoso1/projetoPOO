package utils;

import ticket.Usuario;
import dados.RepositorioUsuario;

public class Util {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario usu1 = new Usuario("Igor","doze","Recife","PE","igor@gmail.com","12345","123","Masc");
		Usuario usu2 = null;
		RepositorioUsuario rep = new RepositorioUsuario();
		
		rep.inserirUsuario(usu1);
		System.out.println(usu1.toString());
	
		rep.removerUsuario(usu2);
		rep.buscarUsuario("12345");
		
		
		
		
		
		
		
	}

}

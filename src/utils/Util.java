package utils;

import ticket.Usuario;
import dados.RepositorioUsuario;
import java.util.Scanner;

public class Util {



	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		RepositorioUsuario rep = new RepositorioUsuario();
		
		while(true){
			System.out.println("***** Meu Evento *****");
			System.out.println("\n1-Login\n2-Cadastrar");
			int opc;
			opc = in.nextInt();
			switch(opc){
			case 1:
				System.out.println("CPF: ");
				String a = in.next();
				break;
			case 2:
				Usuario usu = new Usuario();
				rep.inserirUsuario(usu);
				System.out.println("Nome: ");
				usu.setNome(in.next());
				System.out.println("Sexo: ");
				usu.setSexo(in.next());
				System.out.println("Rua: ");
				usu.setRua(in.next());
				System.out.println("Cidade: ");
				usu.setCidade(in.next());
				System.out.println("Estado: ");
				usu.setEstado(in.next());
				System.out.println("CPF: ");
				usu.setCpf(in.next());
				System.out.println("Email: ");
				usu.setEmail(in.next());
				System.out.println("Senha: ");
				usu.setSenha(in.next());
				break;
			default:
				System.out.println("Escolha aop��o 1 ou 2");
			}
		}
		
		
		
		
		
	}

}

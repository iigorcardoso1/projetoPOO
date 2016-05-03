package utils;

import controladores.ControladorEventos;
import controladores.ControladorIngresso;
import controladores.ControladorUsuarios;

public class Fachada {
	private static Fachada instancia;
	private ControladorUsuarios controladorU;
	private ControladorEventos controladorE;
	private ControladorIngresso controladorI;

	private Fachada(){
		this.controladorU = new ControladorUsuarios();
		this.controladorE = new ControladorEventos();
		this.controladorI = new ControladorIngresso();
	}

	public static Fachada getInstancia(){
		if(instancia==null){
			instancia = new Fachada();
		}
		return instancia;
	}
}


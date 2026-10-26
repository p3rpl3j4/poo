package eventos;

import java.util.ArrayList;

public class Sujeto {
	
	ArrayList<Observador> suscriptores = new ArrayList<Observador>();
	
	public void agregar(Observador observador) {
		suscriptores.add(observador);
	}
	
	public void eliminar(Observador observador){
		
	}
	
	protected void notificar(Evento evento){
		for (Observador observador : suscriptores) {
			observador.actualizar(evento);
			
		}
		
	}
}

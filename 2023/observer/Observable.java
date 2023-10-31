package observer;

import java.util.ArrayList;

public abstract class Observable {
	private ArrayList<Observador> observadores;
	
	public void agregar (Observador obs) {
		observadores.add (obs);
	}
	
	public void eliminar (Observador obs) {
		observadores.remove(obs);
	}
	
	public void notificar () {
		for (Observador observador : observadores) {
			observador.actualizar("");
			
		}
		
	}

	public ArrayList<Observador> getObservadores() {
		return observadores;
	}

	public void setObservadores(ArrayList<Observador> observadores) {
		this.observadores = observadores;
	}

	
}

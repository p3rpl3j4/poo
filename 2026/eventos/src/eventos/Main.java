package eventos;

public class Main {

	public static void main(String[] args) {

		Sujeto observado = new Sujeto();
		
		observado.agregar(new Observador());
		observado.agregar(new Observador());
		observado.agregar(new Observador());

		Evento e = new Evento("Fiesta fluor");
		
		observado.notificar(e);
		
	}

}

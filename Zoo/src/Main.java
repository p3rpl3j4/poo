public class Main {
	
	public static void main(String[] args) {
		// Declaro mis variables
		Gato miGato;
		Perro miPerro;

		miGato = new Gato(); //a partir de acá existe mi objeto
		
		miGato.nombre = "Pereza";
		miGato.edad = 3;
		miGato.genero = "Macho";
		miGato.raza = "Mestizo";
		
		System.out.println("El Pere tiene " + miGato.estaEsMiEdad() + " años");	
		
		
		miPerro =  new Perro("Piñen", 5, "macho", 13, "terrible mezcla");
		miPerro.saludar();
		miPerro.ladrar();
	}
}
package modelo;

public class Perro extends Mascota{
	
	public Perro() {
		
	}

	public Perro(String nombre) {
		super(nombre);
		//this.setNombre(nombre);
		//no podemos, porque nombre es atributo private de Mascota
		//this.nombre = nombre;
	}
	
	public Perro(String nombre, Integer edad) {
		super(nombre, edad);
	}

	
	//HACER LOS METODOS
	
}
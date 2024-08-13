package mascotas;

import modelo.Perro;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	//este es el programa principal del proyecto
	public static void main(String[] args) {
		
		Perro p1 = new Perro("Firulais", 1);
		//Imprimo el nombre Firulais
		System.out.println(p1.getNombre());
		
		
		//Le cambio el nombre al objeto y lo imprimo
		p1.setNombre("Toto");
		System.out.println(p1.getNombre());	
	}
}

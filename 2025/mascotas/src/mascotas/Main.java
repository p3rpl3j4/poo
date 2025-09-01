package mascotas;

import modelo.Gato;
import modelo.Mascota;
import modelo.Perro;

public class Main {

	//este es el programa principal del proyecto
	public static void main(String[] args) {
		Mascota [] mascotas = new Mascota[3];   
		
		Perro p1 = new Perro("Toto");
		System.out.println(p1.toString());

		Perro p3 = new Perro("Firulais", 4);
		System.out.println(p3.toString());
		
		Gato cat = new Gato("Lushika", 5);
		System.out.println(cat.toString());
		
		if (p1.equals(p1))
			System.out.println("Son iguales");
		else
			System.out.println("Son distintos");
			

		mascotas[0] = p1;
		mascotas[1] = cat;
		mascotas[2] = p3;

		for (Mascota mascota : mascotas) {
			System.out.println(mascota.toString());	
		}
		
		for (int i=0; i< mascotas.length; i++) {
			System.out.println("Elemento " + i +  ": " + mascotas[i].toString());
		}
	}
}

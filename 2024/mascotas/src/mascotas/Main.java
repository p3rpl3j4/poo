package mascotas;

import modelo.*;

public class Main {
	//este es el programa principal del proyecto
	public static void main(String[] args) {
		
		Mascota [] mascotas = new Mascota[4];   
		
		Perro p1 = new Perro("Toto");
		Perro p3 = new Perro("Firulais", 4);
		Gato cat = new Gato("Lushika", 5);
		
		//Atención: No puedo instanciar objetos "Mascota" porque es clase abstracta
		/* 
		Mascota m1 = new Mascota("Lopez");
		System.out.println("El perro lopez es mascota pero también perro: ");
		m1.lucirme();
		*/
		mascotas[0] = p1;
		mascotas[1] = cat;
		mascotas[2] = p3;
		
		Persona adoptante1 = new Persona ("Lucy");
		Persona adoptante2 = new Persona ("Romualdo");
		
		cat.setAdoptante(adoptante1);
		System.out.println("Fui adoptado por: " + cat.getAdoptante().getNombre());
			
		for (Mascota mascota : mascotas) {
			System.out.println("------------------------");
			System.out.println(mascota.toString());
			mascota.lucirme();
		}
	
	}
}

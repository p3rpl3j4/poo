package main;

import zoo.*;

public class Main {
	
	public static void main(String[] args) {
		// Declaro mis variables
		Gato miGato;
		Perro miPerro;
		Animal[] mascotas= new Animal [4]; //mascotas, es un arreglo de Animales
			

		miGato = new Gato(); //a partir de acá existe mi objeto "miGato"
		
		/* Las siguientes líneas violan el concepto de encapsulamiento y de ocultamiento
		 * Es buena práctica que los atributos sean privados y que se provean métodos que
		 * permitan leer el valor de los atributos y eventualmente, asignarles valores.
		 * Esto se logra con los métodos conocidos como getters y setters
		 * */
		/*
		miGato.nombre = "Pereza";
		miGato.edad = 3;
		miGato.genero = "Macho";
		miGato.raza = "Mestizo";
		*/
		
		
		miPerro =  new Perro("Piñen", 5, "macho", 13, "terrible mezcla");
		miPerro.saludar();
		miPerro.ladrar();
		
		//instancio un objeto Animal
		
		//puesto que gato es un animal, puedo asignarlo sobre una variable Animal
//		unAnimal = miGato;
		
		//casteo 
		
		
		//instanciamos 2 perros y 2 gatos para guardarlos en el arreglo de animales:
		mascotas[0] = new Perro("Chipo", 3, "macho", 7, "mestizo");
		mascotas[1] = new Gato ("Pereza", 2, "macho", 4, "mestizo");
		mascotas[2] = new Perro("Scraps", 4, "hembra", 1, "puro hueso");
		mascotas[3] = new Gato ("Siesta", 1, "hembra", 5, "mestiza");
		
		//puedo recorrer mi arreglo para invocar algún metodo de Animal:
		//observar que para los animales que son gatos, ejecuta el "caminar" de Animal
		//mientras que para los animales que son perros, ejecuta el "caminar" de Perro
		for(int i = 0; i<4; i++) {
			mascotas[i].caminar();
		}		
	}	
}
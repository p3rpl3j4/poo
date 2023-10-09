package arrayList;


//Se importa sólo la clase que se va a utilizar
//import java.util.ArrayList;
//import java.util.HashSet;
import java.util.Iterator;
//import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {

		//El arrayList permite duplicados y es desordenado
		//ArrayList<Persona> lista = new ArrayList<Persona>();
		
		//El set no acepta duplicados, pero debo redefinir equals()
		//Set<Persona> lista = new HashSet<Persona>();


		//El TreeSet es ordenado, pero debo redefinir compareTo()
		//Ejemplo con TreeSet (coleccion ordenada)
		TreeSet<Persona> lista = new TreeSet<Persona>();

		Persona p1 = new Persona ("Ana", "Lopez", 20);
		Persona p2 = new Persona ("Pepe", "Garcia", 34);
		Persona p3 = new Persona ("Julia", "Martin", 36);
		Persona p4 = new Persona ("Luis", "Lopez", 56);
		Persona p5 = new Persona ("Luis", "Lofredo", 56);

		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);
		lista.add(p5);

		//Recorro con un iterador
		System.out.println("Recorro la colección con un iterador");
		Iterator <Persona> it = lista.iterator();
	
		while (it.hasNext()) 
			System.out.println(it.next().toString());
		
		//Ejemplo de cómo borrar a los luis con un iterador
		it = lista.iterator();

		while (it.hasNext())
			if (it.next().getNombre().equals("Luis"))
				it.remove();

		//Observar que ahora no tiene ningún Luis
		System.out.println("\nAhora recorro la coleccion con un foreach");
	
		for (Persona persona : lista)
			System.out.println(persona.toString());
		
		
		
		/*
		//Ejemplo de uso de mi propia coleccion medio trucha
		//MiArrayList tiene un atributo de tipo array común
		MiArrayList miLista = new MiArrayList(4);
		
		miLista.add("pepe");
		miLista.add("lala");
		miLista.add("lolo");
		miLista.add("lulu");
	
		String palabra = (String)miLista.get(3);
		
		System.out.println(palabra);
*/
	}
}

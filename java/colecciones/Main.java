package colecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set <Persona> personas = new HashSet<Persona>();
		
		Persona p1 = new Persona ("Lucy", "Gutierrez", 40);
		
		Persona p9 = new Persona ("Lucy", "Gutierrez", 41);
		
		System.out.println(p1.hashCode());
		
		Persona p2 = new Persona ("Alan", "Vega", 22);

		Persona p5 = new Persona ("Ana", "Morante", 22);

		Persona p3 = new Persona ("Augusto", "Coria", 24);
		Persona p4 = new Persona ("Pepe", "Trueno", 34);
		
		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		personas.add(p4);
		personas.add(p5);

		
		//recorremos con for each
		for (Persona persona : personas)
			System.out.println(persona.toString());
			
		//recorrer con iterador
		System.out.println("-------------------------");
		Iterator<Persona> it = personas.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next().toString());
			
		}
		
		it.next().toString();
		
	}

}

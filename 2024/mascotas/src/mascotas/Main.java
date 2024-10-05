package mascotas;

import java.util.*;

import modelo.*;

public class Main {
	//Programa principal del proyecto
	public static void main(String[] args) {
		/*---------------------------------------------------------------------------------
		  Colección TreeSet: Descomentar esta porción para probarlo.
		  TreeSet no permite duplicados y es ORDENADA (por nombre, implementando en Mascota la Interfaz Comparable                                             
		-----------------------------------------------------------------------------------*/
	
		Set<Mascota> mascotasTreeSet = new TreeSet<Mascota>(); //Instancio un HashSet (es colección) 
		
		Mascota m1 = new Perro("Toto"); //Instancio un perro y lo agrego a la lista
		mascotasTreeSet.add(m1);
		
		mascotasTreeSet.add(new Perro("Firulais", 4)); //También puedo instanciar las mascotas en el mismo "add"
		mascotasTreeSet.add(new Gato("Lushika", 5));
		mascotasTreeSet.add(new Tortuga("Miguel", 100));
		mascotasTreeSet.add(new Tortuga("Manuelita", 120));
		Mascota m2 = new Tortuga("Miguel", 100);
		mascotasTreeSet.add(m2); //NO almacena REPETIDOS siempre que el objeto a guardar implemente hashCode() e equals()
		
		System.out.println("Mi TreeSet tiene " + mascotasTreeSet.size() + " elementos");
		System.out.println();

		
		//No es ágil para recorrer con un for común porque no es una colección indexada
		
		
		//Recorro el HashSet con un for each
		System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.--.-.-.-.-.-");
		System.out.println("-.-.-.-.-Recorro la coleccion de mascotas con un for each  -.-.-.-.-");	
		for (Mascota mascota : mascotasTreeSet) {
			mascota.lucirme();
		}
		System.out.println();
		
		//Recorro el TreeSet con un iterador TIPADO
		System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.--.-.-.-.-.-");
		System.out.println("-.-.-.-.-Recorro la coleccion de mascotas con un for con iterador tipado-.-.-.-.-");
		for (Iterator<Mascota> iteratorMascota = mascotasTreeSet.iterator(); iteratorMascota.hasNext();) {
			Mascota mascota = iteratorMascota.next();
			mascota.lucirme();
		}		
		System.out.println();
		
		//Recorro el TreeSet con un iterador SIN TIPAR, entonces tengo que castear a MASCOTA
		//Versión más fea que la del iterador tipado (de hecho marca Warning)
		System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.--.-.-.-.-.-");
		System.out.println("-.-.-.-.-Recorro la coleccion de mascotas con un for con iterador sin tipo-.-.-.-.-");
		for (Iterator iterator = mascotasTreeSet.iterator(); iterator.hasNext();) {
			Mascota mascota = (Mascota) iterator.next(); //Al no indicar tipo para el iterador, debo castear
			mascota.lucirme();
		}		
		System.out.println();		
		
		//Cada vez que quiera recorrer el HashSet, obtengo el iterador (porque él avanza sobre las posiciones de la colección)
		Iterator<Mascota> iteratorMascota = mascotasTreeSet.iterator();
		Mascota mascota; 
			
		//Recorro el HashSet con un iterador TIPADO, esta vez con while (es más usado el for)
		System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.--.-.-.-.-.-");
		System.out.println("-.-.-.-.-Recorro la coleccion de mascotas con un while con iterador sin tipo-.-.-.-.-");
		while (iteratorMascota.hasNext()) {
			mascota =  (Mascota) iteratorMascota.next();
			mascota.lucirme();
		}
		System.out.println();
	

		//HashSet no permite duplicados	
		//Set<Mascota> miSetMascotas = new TreeSet<Mascota>();
	/*	Mascota mComparator = new Perro();
		
		Set<Mascota> miSetMascotas = new TreeSet<Mascota>(mComparator);

		Mascota m1 = new Perro("Toto", 10);
		Mascota m2 = new Perro("Firulais", 4);		
		Mascota m3 = new Gato("Lushika", 5);
		Mascota m4 = new Tortuga("Miguel", 120);
		
		//es duplicado?
		Mascota m5 = new Perro("Toto", 10);
		
		miSetMascotas.add(m1);
		miSetMascotas.add(m2);
		miSetMascotas.add(m3);
		miSetMascotas.add(m4);
		miSetMascotas.add(m5);

		for (Mascota mascota : miSetMascotas) {
			System.out.println(mascota.getNombre()+ " " + mascota.getEdad());
		}
		
		
		*/
		
		/*
	
		
		/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
		
		
		/*---------------------------------------------------------------------------------
		  Colección HashSet: Descomentar esta porción para probarlo.
		  HashSet no permite duplicados.                                                 
		-----------------------------------------------------------------------------------*/
	/*
		Set<Mascota> mascotasHashSet = new HashSet<Mascota>(); //Instancio un HashSet (es colección) 
		
		Mascota m1 = new Perro("Toto"); //Instancio un perro y lo agrego a la lista
		mascotasHashSet.add(m1);
		
		mascotasHashSet.add(new Perro("Firulais", 4)); //También puedo instanciar las mascotas en el mismo "add"
		mascotasHashSet.add(new Gato("Lushika", 5));
		mascotasHashSet.add(new Tortuga("Miguel", 100));
		mascotasHashSet.add(new Tortuga("Manuelita", 120));
		Mascota m2 = new Tortuga("Miguel", 100);
		mascotasHashSet.add(m2); //NO almacena REPETIDOS siempre que el objeto a guardar implemente hashCode() e equals()
		
		System.out.println("Mi HashSet tiene " + mascotasHashSet.size() + " elementos");
		System.out.println();

		
		//No es ágil para recorrer con un for común porque no es una colección indexada
		
		
		//Recorro el HashSet con un for each
		System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.--.-.-.-.-.-");
		System.out.println("-.-.-.-.-Recorro la coleccion de mascotas con un for each  -.-.-.-.-");	
		for (Mascota mascota : mascotasHashSet) {
			mascota.lucirme();
		}
		System.out.println();
		
		//Recorro el HashSet con un iterador TIPADO
		System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.--.-.-.-.-.-");
		System.out.println("-.-.-.-.-Recorro la coleccion de mascotas con un for con iterador tipado-.-.-.-.-");
		for (Iterator<Mascota> iteratorMascota = mascotasHashSet.iterator(); iteratorMascota.hasNext();) {
			Mascota mascota = iteratorMascota.next();
			mascota.lucirme();
		}		
		System.out.println();
		
		//Recorro el HashSet con un iterador SIN TIPAR, entonces tengo que castear a MASCOTA
		//Versión más fea que la del iterador tipado (de hecho marca Warning)
		System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.--.-.-.-.-.-");
		System.out.println("-.-.-.-.-Recorro la coleccion de mascotas con un for con iterador sin tipo-.-.-.-.-");
		for (Iterator iterator = mascotasHashSet.iterator(); iterator.hasNext();) {
			Mascota mascota = (Mascota) iterator.next(); //Al no indicar tipo para el iterador, debo castear
			mascota.lucirme();
		}		
		System.out.println();		
		
		//Cada vez que quiera recorrer el HashSet, obtengo el iterador (porque él avanza sobre las posiciones de la colección)
		Iterator<Mascota> iteratorMascota = mascotasHashSet.iterator();
		Mascota mascota; 
			
		//Recorro el HashSet con un iterador TIPADO, esta vez con while (es más usado el for)
		System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.--.-.-.-.-.-");
		System.out.println("-.-.-.-.-Recorro la coleccion de mascotas con un while con iterador sin tipo-.-.-.-.-");
		while (iteratorMascota.hasNext()) {
			mascota =  (Mascota) iteratorMascota.next();
			mascota.lucirme();
		}
		System.out.println();
	*/

		
		
		
		/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
		
		
		
		
		/*---------------------------------------------------------------------------------
		  Colección ArrayList: Descomentar esta porción para probarlo.
		  ArrayList es la colección más simple. Permite duplicados, se carga secuencialmente
		  y sin criterio de orden (tener en cuenta que una vez cargada se puede ordenar con sort()*/
		/*--------------------------------------------------------------------------*/		
		
	/*
		ArrayList<Mascota> mascotasArrayList = new ArrayList<Mascota>(); //Instancio un arrayList (es colección) 
		
		Mascota m1 = new Perro("Toto"); //Instancio un perro y lo agrego a la lista
		mascotasArrayList.add(m1);
		
		mascotasArrayList.add(new Perro("Firulais", 4)); //También puedo instanciar las mascotas en el mismo "add"
		mascotasArrayList.add(new Gato("Lushika", 5));
		mascotasArrayList.add(new Tortuga("Miguel", 100));
		mascotasArrayList.add(new Tortuga("Manuelita", 120));
		mascotasArrayList.add(new Tortuga("Miguel", 100)); //Puedo almacenar REPETIDOS
		
		System.out.println("Mi arraylist tiene " + mascotasArrayList.size() + " elementos");
		System.out.println();

		
		//Recorro el arrayList con un for común
		System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.--.-.-.-.-.-");
		System.out.println("-.-.-.-.-Recorro la coleccion de mascotas con un for común-.-.-.-.-");
		for (int i = 0; i < mascotasArrayList.size() ; i++) {
			mascotasArrayList.get(i).lucirme();
		}
		System.out.println();
		
		//Recorro el arrayList con un for each
		System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.--.-.-.-.-.-");
		System.out.println("-.-.-.-.-Recorro la coleccion de mascotas con un for each  -.-.-.-.-");	
		for (Mascota mascota : mascotasArrayList) {
			mascota.lucirme();
		}
		System.out.println();
		
		//Recorro el arrayList con un iterador TIPADO
		System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.--.-.-.-.-.-");
		System.out.println("-.-.-.-.-Recorro la coleccion de mascotas con un for con iterador tipado-.-.-.-.-");
		for (Iterator<Mascota> iteratorMascota = mascotasArrayList.iterator(); iteratorMascota.hasNext();) {
			Mascota mascota = iteratorMascota.next();
			mascota.lucirme();
		}		
		System.out.println();
		
		//Recorro el arrayList con un iterador SIN TIPAR, entonces tengo que castear a MASCOTA
		//Versión más fea que la del iterador tipado (de hecho marca Warning)
		System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.--.-.-.-.-.-");
		System.out.println("-.-.-.-.-Recorro la coleccion de mascotas con un for con iterador sin tipo-.-.-.-.-");
		for (Iterator iterator = mascotasArrayList.iterator(); iterator.hasNext();) {
			Mascota mascota = (Mascota) iterator.next(); //Al no indicar tipo para el iterador, debo castear
			mascota.lucirme();
		}		
		System.out.println();		
		
		//Cada vez que quiera recorrer la colección, obtengo el iterador (porque él avanza sobre las posiciones de la colección)
		Iterator<Mascota> iteratorMascota = mascotasArrayList.iterator();
		Mascota mascota; 
			
		//Recorro el arrayList con un iterador TIPADO, esta vez con while (es más usado el for)
		System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.--.-.-.-.-.-");
		System.out.println("-.-.-.-.-Recorro la coleccion de mascotas con un while con iterador sin tipo-.-.-.-.-");
		while (iteratorMascota.hasNext()) {
			mascota =  (Mascota) iteratorMascota.next();
			mascota.lucirme();
		}
		System.out.println();
	*/
		
		

	
		
		
		/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
		
		
		
		
		/*---------------------------------------------------------------------------------------
		  Descomentar esta porción para probar cómo podemos recorrer un array en Java 	
		---------------------------------------------------------------------------------------*/
	
	/* 
		Mascota [] mascotas = new Mascota[5]; //Declaro un arreglo de 5 posiciones
		
		//Instancio 4 mascotas diferentes, cada una con su tipo
		Perro p1 = new Perro("Toto");
		Perro p2 = new Perro("Firulais", 4);
		Gato c1 = new Gato("Lushika", 5);
		Tortuga t1 = new Tortuga("Manuelita", 120);
		
		//Cargo arbitrariamente esas mascotas a un array ESTATICO
		mascotas[0] = p1;
		mascotas[1] = p2;
		mascotas[2] = c1;
		mascotas[3] = t1;
		mascotas[4] = new Gato("Demóstenes", 7); //Notar que también puedo instanciar mascotas así (referenciada a través de mascotas[4]
		
		System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
		System.out.println("Una mascota se luce sola");
		mascotas[1].lucirme(); //Luzco una mascota en particular
		System.out.println();

		//Recorro el arreglo para lucir mascotas con diferentes tipos de for
		
		//Recorro el array con un for común
		System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
		System.out.println("Voy a recorrer mascotas con un for común");
		for (int i = 0; i < mascotas.length; i++) {
			mascotas[i].lucirme();
		}
		System.out.println();
		
		//Recorro el array con un for each
		System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
		System.out.println("Voy a recorrer mascotas con un for each");		
		for (Mascota m : mascotas) {
			m.lucirme();
		}
		System.out.println();

	*/

		
		
		
		
		/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
		
		
		
		
		/*---------------------------------------------------------------------------------------
		  Clases Abstractas: Descomentar esta porción para comprobar que no se pueden instanciar 
		  clases abstractas. No puedo instanciar objetos "Mascota" porque es clase abstracta    */
		/*--------------------------------------------------------------------------*/
	/* 
	    Mascota m1 = new Mascota("Lopez");
		System.out.println("El perro lopez es mascota pero también perro: ");
		m1.lucirme();
	*/
		/*--------------------------------------------------------------------------*/
		
		
		
		
		
		/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
		
		
		
		
		/*---------------------------------------------------------------------------------
		  Clases Concretas: Descomentar esta porción para instanciar un adoptante, un perro
		  y para que el perro pueda ser adoptado											*/
		/*--------------------------------------------------------------------------*/
	/* 
		Persona adoptante1 = new Persona ("Lucy");
		Perro perro1 = new Perro("Cartucho", 4);
		
		perro1.setAdoptante(adoptante1);
		System.out.println("Fui adoptado por: " + perro1.getAdoptante().getNombre());
	*/
		/*--------------------------------------------------------------------------*/
	}
}

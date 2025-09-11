package mascotas;


public class Principal {

	public static void main(String[] args) {
		Animal[] animales = new Animal[10];
		
		Gato g1 = new Gato("Pereza", 4);
		Gato gataMala = new Gato("Lushika", 7);
		
		Perro a = new Perro();		
		a.setNombre ("Juanito");
		a.setEdad(1);
		a.setRaza("Salchicha");
		a.vacunar();
		
		Perro b = new Perro("Juanito", 1, new String("Salchicha"));
		
		if (a.equals(b)) 
			System.out.println("Son objetos iguales");
		else
			System.out.println("Son objetos distintos");
		
		System.out.println(a.toString() + " " + a.hashCode()); 
		System.out.println(b.toString() + " " + b.hashCode()); 	
		
		
		animales[0] = a;
		animales[1] = b;
		animales[2] = g1;
		animales[3] = gataMala;
		
		System.out.println("Recorro el arreglo de animales");
		
		for (int i = 0; i < animales.length; i++)
			animales[i].emitirSonido();

		
		
		/*Animal a1;
		/Gato g1 = new Gato("Pereza", 4);
		
		a1 = new Perro("Negrito", 0, "chihuahua");
		System.out.println("Me llamo " + a1.getNombre());
		a1.emitirSonido();
		
		System.out.println("Me llamo " + g1.getNombre());
		g1.emitirSonido();*/
	}
}

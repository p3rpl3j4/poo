package misAnimales;

public class Main {


	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Perro perrito = new Perro ("Jota");
		
		try {
			perrito.setEdad(-8);
		} catch(EdadInvalidaException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println(perrito.toString());

		
		
		
		
		
		
		
		/*
		
		
		
		
		Animal[] animales = new Animal[5]; //arreglo de Animales
		
		animales[0]= new Gato("Pereza", 4, 80);		
		animales[1]= new Perro("Rama", 3, 100);		
		animales[2]= new Pato("Lucas", 50, 150);
		animales[3]= new Gato("Canelo", 1, 60);
		
		//Creo una referencia Animal para instanciar un Pato y asignarlo al arreglo
		Animal a = new Pato("Donald");
		a.setMatricula(20);
		animales[4] = a;
		
		//Recorro el arreglo con for tradicional
		for (int i = 0; i < Animal.getContAnimales(); i++) {
			animales[i].emitirSonido();
			System.out.println("HashCode: " + animales[i].hashCode());
			System.out.println("Matricula: " + animales[i].getMatricula());
		}
		System.out.println("------------");
		
		
		
		if (animales[4].equals(animales[0])) 
			System.out.println("Son iguales");
		else
			System.out.println("Son diferentes");
				
			*/	
		//Recorro el arreglo con un foreach (para cada animal en el arreglo de Animales)
		/*
		for (Animal animal : animales)
			animal.avanzar();
			*/
	}
}

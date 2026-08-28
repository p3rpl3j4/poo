package misAnimales;

public class Main {


	@SuppressWarnings("unused")
	public static void main(String[] args) {		
		Animal[] animales = new Animal[5]; //arreglo de Animales
		
		animales[0]= new Gato("Pereza");		
		animales[1]= new Perro("Rama");		
		animales[2]= new Pato("Lucas");
		animales[3]= new Gato("Canelo");
		
		//Creo una referencia Animal para instanciar un Pato y asignarlo al arreglo
		Animal a = new Pato("Donald");
		animales[4] = a;
		
		//Recorro el arreglo con for tradicional
		for (int i = 0; i < Animal.getContAnimales(); i++) {
			animales[i].emitirSonido();
		}
		System.out.println("------------");
		
		//Recorro el arreglo con un foreach (para cada animal en el arreglo de Animales)
		for (Animal animal : animales) {
			animal.emitirSonido();
		}
	}
}

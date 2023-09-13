package automotor;

public class Main {
	public static void main(String[] args) {		
		//declaro variables
		Auto auto1, auto2;
		Moto moto1;
		
		//instancio objetos
		auto1 = new Auto();
		auto2 = new Auto ("Renault", "Clio");
		
		moto1 = new Moto();
		
		//invoco acelerar de auto y moto
		System.out.println("-----------------------------");
		System.out.println("PROBANDO OBJETOS INDIVIDUALES");
		auto2.acelerar();
		moto1.acelerar();
		
		
		//declaro arreglo de vehiculos y guardo autos y motos
		//tengo una flota de 5 vehiculos
		Vehiculo flota [] = new Vehiculo[5];
		
		
		//cargo arreglo con autos o motos
		flota[0] = moto1;
		flota[1] = auto2;
		flota[2] = new Moto();
		flota[3] = new Auto("Volswagen", "Gol");
		flota[4] = auto1;
		
		System.out.println();
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println("RECORRO ARRAY DE OBJETOS");
		System.out.println("Pruebo metodo redefinido mostrar");
		
		
		//Recorremos el array para mostrar y acelerar 
		//como a moto no le seteamos atributos muestra null
        for (int i=0; i < flota.length; i++){
        	System.out.println(".....");
        	flota[i].mostrar();
            flota[i].acelerar();
        }
	}
}
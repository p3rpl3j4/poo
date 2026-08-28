package pruebaPersona;

public class Main {

	public static void main(String[] args) {
		System.out.println("Soy el programa principal");
		
		//Instancio una persona y reviso el contador de personas
		Persona a = new Persona("Frida", "Kahlo");
		System.out.println("Cantidad de personas:" + Persona.getCantPersonas());

		//Instancio otra persona y reviso el contador de personas
		Persona b = new Persona("Pablo", "Picasso");
		System.out.println("Cantidad de personas:" + Persona.getCantPersonas());

		//Instancio una tercera persona y reviso el contador de personas
		Persona c = new Persona("Pab", "Bernasconi");
		System.out.println("Cantidad de personas:" + Persona.getCantPersonas());

		/* RECORDAR que los métodos de clase se invocan con NombreClase.NombreMétodo()
		   Esto, que da warning SOLO lo hacemos para comprobar que los distintos objetos 
		   ven el mismo valor de cantPersonas
		*/
		System.out.println(a.getNombre() + " ve: " + a.getCantPersonas());
		System.out.println(b.getNombre() + " ve: " + b.getCantPersonas());
		System.out.println(c.getNombre() + " ve: " + c.getCantPersonas());

		/* arbitrariamente cambio el valor del contador, sólo para ver que los objetos 
		   notan y ven este cambio. Notar que da warning por el mismo motivo 
		   que en las lineas de arriba
		*/
		Persona.setCantPersonas(250);
		System.out.println(a.getNombre() + " ve: " + a.getCantPersonas());
		System.out.println(b.getNombre() + " ve: " + b.getCantPersonas());
		System.out.println(c.getNombre() + " ve: " + c.getCantPersonas());
		
	
		
		

		if (a.equals(b)) 
			System.out.println("Son objetos iguales");
		else
			System.out.println("Son objetos distintos");	
		
		System.out.println("hashCode de objeto a " + a.hashCode());
		System.out.println("hashCode de objeto b " + b.hashCode());

		
		
		a.saludar();
		System.out.println("Voy a mostrar un nombre: " + a.getNombre());
		
		System.out.println("Longitud de tu nombre: " + a.getNombre().length());
	
		a.setEdad(50);
		
		a.saludar();
	
		//Instancio un Socio
		Socio s1 = new Socio("Newen", "Riquelme");

		System.out.println(s1.getApellido());
		
	
		
		
	}
}

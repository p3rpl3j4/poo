package asoc_simple;

public class Main {

	public static void main(String[] args) {

		Persona locatario = new Persona ("Alicia", "40900800");
		Inmueble casa = new Inmueble ("Mitre", 655);

		Alquiler alq = new Alquiler(locatario, casa, 30000, 6);
		

		System.out.println("La persona " + locatario.getNombre()+ 
				           " paga " + alq.getMontoPorMes() + " por mes");
		
		System.out.println("La persona " + alq.getLocatario().getNombre()+ 
				           " paga " + alq.getMontoPorMes() + " por mes");
	}

}

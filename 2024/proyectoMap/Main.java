package proyectoMap;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<String, Estudiante> padron = new HashMap<String, Estudiante>();
		
		padron.put("1", new Estudiante("Pablo", "30-12345-2"));
		padron.put("2", new Estudiante("Analia", "24-34556-3"));
		padron.put("3", new Estudiante("Lorenzo", "30-45677-8"));
		padron.put("1", new Estudiante("Lucy", "3"));

		
		System.out.println(padron);
		
	}

}

package miEmpresa;

import java.util.HashMap;

public class MainMap {
	public static void mainMap(String[] args) {
		HashMap<String, Cliente> clientes = new HashMap<String, Cliente> ();
		
		clientes.put("01-100", new Cliente("Lucy", "Gutierrez", 100));
		clientes.put("01-140", new Cliente("Patricio", "Estrella", 140));
		clientes.put("01-101", new Cliente("Benjamín", "Button", 105));
	
		System.out.println(clientes);
	}
}

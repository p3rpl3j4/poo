package miEmpresa;

import java.util.HashSet;

public class MainHashSet {

	//Cambiar nombre a main para probar
	public static void mainHashSet(String[] args) {
		HashSet <Cliente> mis_clientes = new HashSet <Cliente>();
		
		Cliente cliA = new Cliente("Lucy", "Gutierrez", 100);
		Cliente cliB = new Cliente("Patricio", "Estrella", 140);
		Cliente cliC = new Cliente("Benjamín", "Button", 105);
		
		mis_clientes.add(cliA);
		mis_clientes.add(cliC);
		mis_clientes.add(cliB);
		mis_clientes.add(new Cliente("Lucy", "Gutierrez", 100));
		mis_clientes.add(new Cliente("Lucy", "Gutierrez", 105));

		for (Cliente cliente : mis_clientes)
			System.out.println(cliente.toString());
	}

}

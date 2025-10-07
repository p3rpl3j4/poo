package miEmpresa;

import java.util.ArrayList;

public class MainArrayList {

	//Cambiar nombre a main para probar
	public static void mainArrayList(String[] args) {
		Cliente comparador = new Cliente();

		ArrayList<Cliente> mis_clientes = new ArrayList<Cliente>();
		
		Cliente cliA = new Cliente("Lucy", "Gutierrez", 100);
		Cliente cliB = new Cliente("Patricio", "Estrella", 140);
		Cliente cliC = new Cliente("Benjamín", "Button", 105);
		
		mis_clientes.add(cliA);
		mis_clientes.add(cliC);
		mis_clientes.add(cliB);
		mis_clientes.add(new Cliente("Pepe", "Trueno", 102));
		
		//ordeno el arrayList con criterio dado por objeto "Comparator"
		mis_clientes.sort(comparador);
		
		for (Cliente cliente : mis_clientes)
			System.out.println(cliente.toString());	
	}
}

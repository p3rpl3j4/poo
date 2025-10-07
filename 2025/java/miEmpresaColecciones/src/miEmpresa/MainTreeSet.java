package miEmpresa;

import java.util.TreeSet;

public class MainTreeSet {

	//Cambiar nombre a main para probar
	public static void mainTreeSet(String[] args) {
		Cliente comparador = new Cliente();
		
		/* Este TreeSet comentado usa criterio de orden 
		 * en su caracter de Comparator usando compare() */
		TreeSet <Cliente> mis_clientes = new TreeSet <Cliente>(comparador);

		/* Este TreeSet comentado usa criterio de orden 
		 * en su caracter de Comparable usando compareTo() */
		//TreeSet <Cliente> mis_clientes = new TreeSet <Cliente>();
		
		Cliente cliA = new Cliente("Lucy", "Gutierrez", 200);
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
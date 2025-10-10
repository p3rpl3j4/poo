package miEmpresa;

import java.util.Iterator;
import java.util.PriorityQueue;

public class MainPriorityQueue {

	public static void mainPQ(String[] args) {
		Cliente comparator = new Cliente();
		
		PriorityQueue<Cliente> mis_clientes = new PriorityQueue<Cliente> (comparator);

		Cliente cliA = new Cliente("Lucy", "Gutierrez", 200);
		Cliente cliB = new Cliente("Patricio", "Estrella", 140);
		Cliente cliC = new Cliente("Benjamín", "Button", 105);
		
		mis_clientes.add(cliA);
		mis_clientes.add(cliC);
		mis_clientes.add(cliB);
		mis_clientes.add(new Cliente("Lucy", "Gutierrez", 100));
		mis_clientes.add(new Cliente("Lucy", "Gutierrez", 105));
		
	//	System.out.println(mis_clientes);
		
		System.out.println(mis_clientes.size());
		System.out.println(mis_clientes.poll());
		System.out.println("--------");
		for (Cliente cliente : mis_clientes)
			System.out.println(cliente.toString());
		
		Iterator<Cliente> it = mis_clientes.iterator();
		
		System.out.println("Recorro con iterador");
		while (it.hasNext())
			//aca puedo filtar 
			System.out.println(it.next());		
	}
}

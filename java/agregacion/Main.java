package agregacion;

public class Main {

	public static void main(String[] args) {
		Automovil autito = new Automovil("Fiat", "Uno", "gris topo");
		Componente [] componentes = new Componente [3];
		
		componentes[0] = new Componente ("estéreo");
		componentes[1] = new Componente ("Aire acondicionado");
		componentes[2] = new Componente ("Air Bag");
		
	/*	Componente comp1 = new Componente ("estéreo");
		Componente comp2 = new Componente ("Aire acondicionado");
		Componente comp3 = new Componente ("Air Bag");
		
		Componente [] componentes = new Componente [3];
		componentes[0] = comp1;
		componentes[1] = comp2;
		componentes[2] = comp3;
		*/
		
		autito.setComponentes(componentes);
	}

}

package miDecorator;

public class Main {

	public static void main(String[] args) {
	
		Auto autoRecontraDecorado = new AutoNafteroJuguete(new AutoNaftero (new AutoBase ("Gol")));
		autoRecontraDecorado.arracar();
		autoRecontraDecorado.acelerar();
		

		
/*
		Auto auto = new AutoBase ("Gol");
		auto.arracar();
		auto.acelerar();
		
		System.out.println("-----------------------");
		
		Auto autoDecorado = new AutoNaftero (auto);
		autoDecorado.arracar();
		autoDecorado.acelerar();
		
		
		System.out.println("-----------------------");
		Auto autoRecontraDecorado = new AutoNafteroJuguete(autoDecorado);
		autoRecontraDecorado.arracar();
		autoRecontraDecorado.acelerar();
		*/
	}

}

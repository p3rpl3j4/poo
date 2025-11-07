package muebles;

public class Main {

	public static void main(String[] args) {
		
		//creo fabrica moderna
		FabricaDeMueblesModernos fabricaModernos = new FabricaDeMueblesModernos();
		
		//la fabrica moderna sabe crear sillas y sillones modernos
		Silla sillaModerna = fabricaModernos.createSilla();
		Sillon sillonModerno = fabricaModernos.createSillon();
		
		System.out.println(sillaModerna.getDescripcion());
		System.out.println(sillonModerno.getDescripcion());

	
		FabricaDeMuebles fabricaAntigua = new FabricaDeMueblesAntiguos();
		//la fabrica antigua sabe crear sillas y sillones antiguos
		Silla sillaAntigua = fabricaAntigua.createSilla();
		Sillon sillonAntiguo = fabricaAntigua.createSillon();
		
		System.out.println(sillaAntigua.getDescripcion());
		System.out.println(sillonAntiguo.getDescripcion());
	}

}

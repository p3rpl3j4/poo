package miDecorator;

public abstract class AutoDecorador implements Auto {
	private Auto auto;

	public AutoDecorador(Auto auto) {
		super();
		this.auto = auto;
	}

	public Auto getAuto() {
		return auto;
	}

}

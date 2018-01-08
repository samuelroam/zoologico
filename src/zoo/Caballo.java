package zoo;

public class Caballo extends Animal{
	private boolean domado;
	private double velocidadMax;
	
	
	public Caballo(){
		super("Caballo", 4);
	}
	
	public Caballo(double velocidadMax){
		super("Caballo", 4);
		this.setDomado(true);
		this.setVelocidadMax(velocidadMax);
	}
	
	
	public void mostrar(){
		String estaDomado="";
		if (!domado){
			estaDomado="no ";
		}
		System.out.println("Soy un "+super.getEspecie()+" y tengo "+super.getPatas()+", velocidad maxima es "+velocidadMax+" km/h y "+estaDomado+" estoy domado");
		
	}
	
	/**
	 * @return the domado
	 */
	public boolean isDomado() {
		return domado;
	}
	/**
	 * @param domado the domado to set
	 */
	public void setDomado(boolean domado) {
		this.domado = domado;
	}

	/**
	 * @return the velocidadMax
	 */
	public double getVelocidadMax() {
		return velocidadMax;
	}
	/**
	 * @param velocidadMax the velocidadMax to set
	 */
	public void setVelocidadMax(double velocidadMax) {
		this.velocidadMax = velocidadMax;
	}
	
}

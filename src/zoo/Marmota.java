package zoo;

public class Marmota extends Animal{
	
	private int peso;
	private String nombre;
	
	/*
	 * GETTERS & SETTERS
	 */
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	
	/*
	 * Functions
	 */
	
	public void mostrarinfo(){
		System.out.println("El " + super.getEspecie() +" tiene " + this.getPeso() +" kilos");
	}
	

	
	/*
	 * CONSTRUCTORS
	 */
	public Marmota( String tipo, int patas ) {
		super("marota", 4);
		this.setPeso(peso);
	}

	@Override
	public void mostrar() {
		System.out.println("Soy una marmota, wii");
		
	}
	
}

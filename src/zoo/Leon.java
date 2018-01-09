package zoo;

public class Leon extends Animal {
	
	private double peso;
	private double altura;
	private String tipo_habitat;
	private int edad;
	private String nombre;
	
	public Leon(){
		super("leon", 4);
	}
	

	
	public Leon (double peso, double altura, int edad){
		super("leon", 4);
		this.altura = altura;
		this.edad = edad;
		this.peso = peso;
	}
	
	
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getTipo_habitat() {
		return tipo_habitat;
	}

	public void setTipo_habitat(String tipo_habitat) {
		this.tipo_habitat = tipo_habitat;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void mostrarInfo(){
		System.out.println("El " + super.getEspecie() +" tiene " + this.getPeso() +" kilos y tiene "+this.getEdad() +" años");
	}



	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		
	}
	

}

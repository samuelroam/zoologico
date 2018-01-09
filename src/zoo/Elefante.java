package zoo;

public class Elefante extends Animal {
	private String color;
	private double longitudTrompa;
	
	public Elefante() {
		super("elefante", 4);
	}
	
	public Elefante(String color, double longitudTrompa){
		super("Elefante", 4);
		this.longitudTrompa = longitudTrompa;
	}
	
	String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getLongitudTrompa() {
		return longitudTrompa;
	}
	public void setLongitudTrompa(double longitudTrompa) {
		this.longitudTrompa = longitudTrompa;
	}
	
	public void mostrarInfo(){
		System.out.println("Soy un " + this.getEspecie() + " con " + this.getPatas() + " patas");
		System.out.println("Soy de color " + this.getColor() + " y mi trompa mide " + this.getLongitudTrompa() + "m");
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		
	}
	
	
}

package zoo;

public class Rana extends Animal{

	private String Color;
	
	
	//Constructores
	
	public Rana(){
		
	}
	
	public Rana(String especie, int patas, String Color) {
		this.setColor(Color);
		super.setEspecie(especie);
		super.setPatas(patas);
	}
	
	//Getters y Setters
	
	public String getColor() {
		return Color;
	}


	public void setColor(String color) {
		Color = color;
	}
	
	//MostrarInfo
	
	public void mostrarInfo(){
		System.out.println("La especie es: " + super.getEspecie());
		System.out.println("Tiene " + super.getPatas() + " patas.");
		System.out.println("Es de color " + this.getColor());
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		
	}
	
	

}
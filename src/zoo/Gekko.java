package zoo;

public class Gekko extends Animal {
	int cantidadDedos = 5;
	float longitud;
	float peso;
	boolean puedePegarse = true;
	boolean pegado = false;
	int rotacion = 0;
	
	public Gekko() {
		super("gekko", 4);
		// TODO Auto-generated constructor stub
	}
	
	public void getInfo (){
		System.out.print ("Este Gekko tiene " + cantidadDedos + " dedos y");
		if (this.isPuedePegarse()){
			System.out.println(" puede pegarse");
		}else {
			System.out.println(" no puede pegarse");
		}
		System.out.println("Su longitud es de " + longitud + "cm y tiene un peso de " + peso + "gr.");	
	}
	
	public void pegarse(){
		if (puedePegarse){
		System.out.println("Me he pegado a la superficie.");
		this.setPegado(true);
		} else {
			System.out.println("No puedo pegarme porque solo tengo " + this.getCantidadDedos() + " dedos.");
		}
	}
	public void despegarse(){
		System.out.println("Me voy ha despegar de la superficie... [" + this.getRotacion() + "º ] [ " + this.isPegado() + " ]");
		if(!this.isPegado()){
			System.out.println("No me puedo despegar... no estoy pegado...");
		}else if (this.getRotacion() > 70){
			System.out.println("Me despego y me la pego...");
		}else {
			System.out.println("Me he despegado.");
		}
		this.setPegado(false);
	}
	
	public void Andar(){
		System.out.println("Comienzo a andar.");
	}
	public int getCantidadDedos() {
		return cantidadDedos;
	}
	
	public void setCantidadDedos(int cantidadDedos) {
		this.cantidadDedos = cantidadDedos;
		if (this.cantidadDedos < 3){
			this.setPuedePegarse(false);
		}else 
			this.setPuedePegarse(true);
	}
	
	public float getLongitud() {
		return longitud;
	}
	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public boolean isPuedePegarse() {
		return puedePegarse;
	}
	public void setPuedePegarse(boolean puedePegarse) {
		this.puedePegarse = puedePegarse;
	}
	public int getRotacion() {
		return rotacion;
	}
	public void setRotacion(int rotacion) {
		this.rotacion = rotacion;
	}
	public boolean isPegado() {
		return pegado;
	}
	public void setPegado(boolean pegado) {
		this.pegado = pegado;
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println("Mostrando Info: ");
		this.getInfo();
	}
	
	
	
	
}

package zoo;

public class MainIbaiA {

	public static void main(String[] args) {

		
		Animal[] animales = new Animal[5];
		
		animales[0] = new Mono("ibai", "chimpance");
		animales[1] = new OsoPanda();
		animales[2] = new Gekko();
		animales[3] = new Pez();
		animales[4] = new Perro("Tobi", "Golden Terrier");
		
		for(int i=0; i< animales.length;i++){
			animales[i].mostrar();
		}//Cierra for
	}

}

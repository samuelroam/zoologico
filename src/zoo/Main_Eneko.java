package zoo;

public class Main_Eneko {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] animales = new Animal[5];
		animales[0] = new Pez();
		animales[1] = new Perro("Ona", "chiuaua");
		animales[2] = new OsoPanda();
		animales[3] = new Mono();
		animales[4] = new Gekko();
		
		for (int i = 0; i < animales.length; i++){
			System.out.println(animales[i].getEspecie());
			animales[i].mostrar();
		}
	}
}

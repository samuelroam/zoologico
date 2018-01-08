package zoo;

public class Main_JonA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] animales=new Animal[5];
		animales[0]=new Caballo(50);
		animales[1]=new Pinguino();
		animales[2]=new Gekko();
		animales[3]=new OsoPanda();
		animales[4]=new Perro("Lur", "Caniche");
		
		for (int i = 0; i < animales.length; i++) {
			animales[i].mostrar();
		}

	}

}

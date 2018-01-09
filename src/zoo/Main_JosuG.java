package zoo;

import zoo.Animal;
import zoo.Elefante;
import zoo.Leon;
import zoo.Lombriz;
import zoo.Mono;
import zoo.OsoPanda;

public class Main_JosuG {
	public static void main(String[] args){
	Animal[] animales = new Animal[5];
	animales[0] = new Elefante();
	animales[1] = new Lombriz();
	animales[2] = new Mono();
	animales[3] = new Leon();
	animales[4] = new OsoPanda();
	
	for(int i=0; i < animales.length; i++){
		Animal animal = animales[i];
		animal.mostrar();
	}
	}
}

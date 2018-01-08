package zoo;

import java.util.Arrays;

public class MainYaizaM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//crear un array de animales 
		
			Animal[] animales = new Animal[5]; 
			
			animales[0] = new OsoPanda(); 
			
			animales[1] = new Gekko(); 
			
			animales[2] = new Mono(); 
			
			animales[3] = new Perro("Yako", "Spanier"); 
			
			animales[4] = new Pez(); 
			
			//recorrer el array
			
			for(int i = 0; i < animales.length; i++){
				Animal animal = animales[i]; 
				animal.mostrar();//aplicar método mostrar 
			}
	}

}

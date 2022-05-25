package polyEx;

import Animal.Animal;
import Extend.Eagle;
import Extend.Human;
import Extend.Tiger;

public class main {
	public static void main(String[] args) {
		Animal animal = new Animal();
		
	animal.moveAnimal(new Human());
	animal.moveAnimal(new Tiger());
	animal.moveAnimal(new Eagle());
	
	}
}

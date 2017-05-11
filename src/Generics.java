import java.util.ArrayList;
import java.util.List;

class Animal {
	String name;

	public Animal(String name) {
		this.name = name;
	}
}

class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}
}

class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}
}

public class Generics {
	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<>();
		//List<Animal> animals2 = new ArrayList<Dog>(); //Not allowed
		animals.add(new Dog("Moti"));
		animals.add(new Cat("kitty"));
		for (Animal d : animals) {
			System.out.println(d.name);
		}
		
		List<? extends Animal> animals2 = animals;
		
		for(Animal a: animals2){
			System.out.println(a.name);
		}
		
		
	}
}

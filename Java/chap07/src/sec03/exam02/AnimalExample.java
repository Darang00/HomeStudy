package sec03.exam02;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----------");
		
		//auto converting of variable
		Animal animal = null;
		
		animal = new Dog(); //auto converting type from parent to child
		animal.sound(); //calling the method
		
		animal = new Cat(); //auto converting type from parent to child
		animal.sound(); //calling the method
		
		System.out.println("-----------");
		
		//Polymorphism of method (메소드의 다형성)
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	public static void animalSound(Animal animal) { //auto converting type from Dog and Cat to animal
		animal.sound(); //calling the overridden method
	}
}

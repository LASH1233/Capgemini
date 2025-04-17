package inheritance;

public class Driver {
	public static void main(String[] args) {
		Animal animal = new Animal();
		System.out.println(animal.a);
		animal.methodOfParent();
		Dog dog = new Dog();
		dog.methodOfChild();
		Animal.methodOfParent2();
		Dog.methodOfChild2();
		Dog.methodOfParent2();
	}
}

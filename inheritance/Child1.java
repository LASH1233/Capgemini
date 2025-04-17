package inheritance;

public class Child1 extends Parent1{
	String name = "Ronaldo";
	void display() {
		String name = "local";
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
	}
}

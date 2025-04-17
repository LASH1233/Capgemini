package abstraction;

public class Driver {
	public static void main(String[] args) {
		Calculator c = new CalciChild();
		System.out.println(c.add(4, 5));
		System.out.println(c.subtract(8, 5));
	}
}

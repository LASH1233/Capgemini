package abstraction;

public class AtmDriver {
	public static void main(String[] args) {
		ATM a = new ATM(0,12345);
		System.out.println(a.withdraw(50, 11111));

	}
}

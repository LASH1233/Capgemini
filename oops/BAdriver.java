package oops;

public class BAdriver {
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		System.out.println(b.deposit(2000).withdraw(500).getBalance());
	}
}

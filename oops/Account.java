package oops;

public class Account {
	private String AcHolderName;
	private double AcBalance;
	private long AcNumber;
	
	public String getName() {
		return this.AcHolderName;
	}
	public double getBalance() {
		return this.AcBalance;
	}
	public long getNumber() {
		return this.AcNumber;
	}
	public void setName(String name) {
		this.AcHolderName = name;
	}
	public void setBalance(double balance) {
		this.AcBalance = balance;
	}	
	public void setNumber(long number) {
		this.AcNumber = number;
	}
	public double withdraw(double amount) {
		System.out.println("Amount to withdraw is : " + amount);
		if(amount<this.AcBalance) {
			this.AcBalance -= amount;
		}
		return this.AcBalance;
	}
	public double deposit(double amount) {
		System.out.println("Amount to be deposited is : " + amount);
		if(amount>0) {
			this.AcBalance += amount;
		}
		System.out.println("Amount deposited successfully");
		return this.AcBalance;
	}
	public void checkBalance(double balance) {
		System.out.println("Account Balance is " + this.AcBalance);
	}
	
	
}

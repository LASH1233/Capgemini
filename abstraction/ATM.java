package abstraction;

public class ATM {
	private double money;
	private int pin;
	public double withdraw(double amount,int pin) {
		if(this.money<=amount) {
			throw new InvalidMoney();
		}else if(pin!=this.pin) {
			throw new InvalidPin();
		}else {
			this.money-=amount;
			return this.money;
		}
	}
	public ATM(double money,int pin){
		this.money=money;
		this.pin=pin;
		
	}
	
}

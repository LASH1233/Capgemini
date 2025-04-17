package oops;

public class Passport {
	private String passport_number;
	Passport(String number){
		this.passport_number=number;
	}
	
	public String getPassport_number() {
		return passport_number;
	}
	public void setPassport_number(String passport_number) {
		this.passport_number=passport_number;
	}
}

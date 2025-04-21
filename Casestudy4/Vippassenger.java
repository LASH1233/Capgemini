package Casestudy4;

public class Vippassenger extends Passenger {
	public Vippassenger(String name) {
	super(name);
	}
    @Override
    public String toString() {
    	return "VIP Passenger:" + super.toString().substring(10);
    }
}

package oops;

public class CalcDriver {
	public static void main(String[] args) {
		Calculator c = new Calculator(34,56);
		Calculator.add(c).multiply(c);
		System.out.println(c.getResult());
//		c=Calculators.add(c);
//		System.out.println(c.getResult());
//		c=Calculators.multiply(c);
//		System.out.println(c.getResult());
	}
	
}

package Generics;

public class Boxdriver {
	public static void main(String[] args) {
		Box<Integer> b1= new Box<>(10);
		int value=(int) b1.getValue();
		System.out.println(value);
		
		Box<String> b2=new Box<>("Hello");
		String value2=b2.getValue();
		System.out.println(value2);
	}

}

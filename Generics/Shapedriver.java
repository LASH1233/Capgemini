package Generics;

public class Shapedriver {
	public static void main(String[] args) {
		Shape<Double, String> s1=new Shape<>(10.8,"Black");
		Double key=s1.getKey();
		String value= s1.getValue();
		System.out.println(value);
		System.out.println(key);
				}

}

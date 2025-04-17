package wrapper;

public class Demo {
	public static void main(String[] args) {
		double d = 5.6;
		Double d1=d;
		System.out.println(d1);
		int i=6;
		Integer i2=Integer.valueOf(i);
		System.out.println(i2);
		Integer i3=new Integer(i);
		int i5=i3.intValue();
		Double d3=new Double(d);
		double d4=d3.doubleValue();
		System.out.println(i5);
		System.out.println(d4);
	}
}

package capgemini;

public class DriverMobile {
	public static void main(String[] args) {
		Mobile mb = new Mobile("Apple", 85000, 256);
		System.out.println(mb.brand + " " + mb.price + " " + mb.ram);
		Mobile mb2 = new Mobile("Samsung", 67000, 256);
		System.out.println(mb2.brand + " " + mb2.price + " " + mb2.ram);
	}
}

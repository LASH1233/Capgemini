package exception;

public class Demo {
	public static void print() throws InterruptedException{
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
	public static void demo2() throws InterruptedException{
		print();
	}
	public static void main(String[] args) {
		try {
			demo2();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}

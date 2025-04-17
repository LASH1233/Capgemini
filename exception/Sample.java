package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sample {
//	public static int m1() {
//		try {
//			return 1;
//		}
//		catch(Exception e) {
//			return 2;
//		}
//		finally {
//			return 3;
//		}
//	}
	public static void main(String[] args) {
		int n=0;
		try(Scanner sc = new Scanner(System.in);){
			n=sc.nextInt();
		}
		catch(InputMismatchException e) {
			e.printStackTrace();
		}
		System.out.println(n);
	}
	
}

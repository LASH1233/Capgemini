package abstraction;

import java.util.Scanner;

public class Eligible {
	public static void ageChecker(int age) {
		if(age>=21) {
			System.out.println("get married");
		}else {
			throw new InvalidAge("wait");
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		ageChecker(age);
	}
}

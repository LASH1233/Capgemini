package capgemini;

import java.util.Scanner;
import java.lang.Math;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int temp2 = n;
		int count = 0;
		while(n!=0) {
			count++;
			n/=10;
		}
		int sum= 0;
		while(temp!=0) {
			int ld = temp%10;
			sum += Math.pow(ld, count);
			temp/=10;
		}
		if(sum==temp2) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not an armstrong number");
		}
	}
}

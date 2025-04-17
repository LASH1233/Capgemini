package capgemini;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean result = isPalindrome(n);
		if(result == true) {
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println("Not a Palindrome Number");
		}
	}
	public static boolean isPalindrome(int num) {
		int temp = num;
		int rev = 0;
		while(temp!=0) {
			int ld = temp%10;
			rev = rev*10+ld;
			temp/=10;
		}
		return rev == num;
	}

}

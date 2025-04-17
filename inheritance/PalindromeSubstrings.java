package inheritance;

import java.util.Scanner;

public class PalindromeSubstrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.next();
		int n = s.length();
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (isPalindrome(s, i, j)) {
					count++;
				}
			}
		}
		System.out.println("Palindromic Substrings : " + count);
	}

	public static boolean isPalindrome(String s, int left, int right) {
		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;right--;
		}
		return true;
	}
}

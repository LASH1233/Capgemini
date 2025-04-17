package casestudy;

import java.util.Scanner;

public class MissingNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]arr = {3,0,1};
		System.out.println(findNumber(arr));
	}
	public static int findNumber(int[] arr) {
		int n=arr.length;
		int ans=0;

		for(int i=1;i<n;i++) {
			ans ^= i^arr[i];
		}
		return ans;
	}
}

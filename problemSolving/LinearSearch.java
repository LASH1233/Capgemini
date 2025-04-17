package problemSolving;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter target: ");
		int target=sc.nextInt();
		int res=findTarget(arr,n,target);
		System.out.println(res);
	}
	public static int findTarget(int[] arr,int n,int target) {
		for(int i=0;i<n;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
}

package capgemini;

import java.util.Scanner;

public class Target {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("enter an element: ");
			arr[i] = sc.nextInt();
		}
		System.out.println("enter the target element");
		int target = sc.nextInt();
		int res = findCeil(arr,n,target);
		System.out.println("result is: " + res);
		
	}
	public static int findCeil(int[] arr,int n,int target) {
		int start = 0;
		int end = n-1;
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(arr[mid]==target) {
				return mid+1;
			}
			else if(target<arr[mid]) {
				end = mid-1;
			}
			else{
				start = mid+1;
			}
			
		}
		return end+1;

	}
}

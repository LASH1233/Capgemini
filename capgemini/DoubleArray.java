package capgemini;

import java.util.Scanner;

public class DoubleArray {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		double[] arr= new double[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextDouble();
		}
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i] + " ");
		}
		
	}
}

package capgemini;

import java.util.Scanner;
import java.util.Arrays;
public class MArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter rows: ");
		int rows = sc.nextInt();
		System.out.println("enter columns: ");
		int columns = sc.nextInt();
		double[][] arr = new double[rows][columns];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = sc.nextDouble();
			}
		}
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[i][j] + "\t");
//			}
//			System.out.println();
//		}
//		for(double[] a: arr) {
//			for(double i:a) {
//				System.out.print(i + " ");
//			}
//			System.out.println();
//		}

		for(double[] a:arr) {
			System.out.println(Arrays.toString(a));
		}
	}
}

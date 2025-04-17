package problemSolving;

import java.util.Arrays;
import java.util.Scanner;

public class Ls2d {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		Scanner sc=new Scanner(System.in);
		int target=sc.nextInt();
		int[] res=findTarget(arr,arr.length,target);
		System.out.println(Arrays.toString(res));
	}

	public static int[] findTarget(int[][] arr, int length, int target) {
		int[] ans=new int[length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==target) {
					return new int[] {i,j};
				}
			}
		}
		return new int[] {-1,-1};
	}
	
}

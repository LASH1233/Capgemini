package sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {7,5,3,1,4,0};
		int n=arr.length;
		int[] res=insertion(arr,n);
		System.out.println(Arrays.toString(res));
	}
	public static int[] insertion(int[] arr,int n) {
		for(int i=1;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		return arr;
	}
}

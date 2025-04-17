package sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr= {2,5,3,1,4,0};
		int n=arr.length;
		int[]result = bubbleSort(arr,n);
		System.out.println(Arrays.toString(result));
		
	}
	public static int[] bubbleSort(int[] arr,int n) {
		boolean swapped;
		for(int i=0;i<n-1;i++) {
			swapped=false;
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}
			}
			if(!swapped) {
				break;
			}
		}
		return arr;
	}
}

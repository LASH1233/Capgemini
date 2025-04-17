package problemSolving;

import java.util.Arrays;

public class FirstandLastIndex {
	public static void main(String[] args) {
		int[] arr = {5,7,8,8,8,10};
		int target=8;
		int[] res = findRange(arr,target);
		System.out.println(Arrays.toString(res));
	}
	public static int[] findRange(int[] arr,int target) {
		int start=findStart(arr,target);
		int end = findLast(arr,target);
		return new int[] {start,end};
	}
	public static int findStart(int[] arr,int target) {
		int start=0;
		int end=arr.length-1;
		int ans=-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==target) {
				ans=mid;
				end=mid-1;
			}else if(arr[mid]>target) {
				end=mid-1;
			}else if(arr[mid]<target){
				start=mid+1;
			}
		}
		return ans;
	}
	public static int findLast(int[] arr,int target) {
		int start=0;
		int end=arr.length-1;
		int ans=-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==target) {
				ans=mid;
				start=mid+1;
			}else if(arr[mid]>target) {
				end=mid-1;
			}else if(arr[mid]<target){
				start=mid+1;
			}
		}
		return ans;
	}
}

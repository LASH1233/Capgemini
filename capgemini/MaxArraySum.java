package capgemini;

public class MaxArraySum {
	public static void main(String[] args) {
		int[] arr = {-2,1,-3,4,-1,2,1,-5,-4};
		int n = arr.length;
		System.out.println(findMaxSum(arr,n));
	}
	public static int findMaxSum(int[] arr,int n) {
		int currentSum=arr[0];
		int maxSum=arr[0];
		for(int i=1;i<n;i++) {
			currentSum = Math.max(arr[i],currentSum+arr[i]);
			maxSum = Math.max(maxSum, currentSum);
		}
		return maxSum;
	}
}

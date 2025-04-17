package problemSolving;

public class EvenDigits {
	public static void main(String[] args) {
		int[] arr = {12,345,2,6,7896};
		int res=check(arr,arr.length);
		System.out.println(res);
	}
	public static int check(int[] arr,int n) {
		int count=0;
		for(int i=0;i<n;i++) {
			if(evenDigits(arr[i])) {
				count++;
			}
		}
		return count;
	}
	public static boolean evenDigits(int n) {
		int count=0;
		while(n!=0) {
			n/=10;
			count++;
		}
		return(count%2==0);
	}
}

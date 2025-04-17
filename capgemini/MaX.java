package capgemini;
import java.util.Arrays;
public class MaX {
	public static void main(String[] args) {
		int[][] arr = {{3,1,2},{4,9,5},{8,1,3}};
		int[] res = findMaxIndex(arr);
		System.out.println(Arrays.toString(res));
	}
	public static int[] findMaxIndex(int[][] arr) {
		int maxi = -1;int[] ans = new int[2];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]>maxi) {
					maxi = arr[i][j];
					ans = new int[] {i,j};
					
				}
			}
		}
		return ans;
	}
}

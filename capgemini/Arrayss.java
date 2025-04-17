package capgemini;
import java.util.Arrays;
public class Arrayss {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,5,1,2};
		System.out.println(Arrays.toString(arr));
//		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.binarySearch(arr, 7));
		 int[] b = Arrays.copyOf(arr, 10);
		System.out.println(Arrays.toString(b));
		arr = Arrays.copyOfRange(arr, 0, 5);
		System.out.println(Arrays.toString(arr));
	}
}

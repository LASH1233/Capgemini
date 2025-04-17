package capgemini;

public class MaxofMatrix {
	public static void main(String[] args) {
		int[][] arr = {{3,1,2},{4,9,5},{8,1,3}};
		int maxi = -1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]>maxi) {
					maxi = arr[i][j];
				}
			}
		}
		System.out.println("max element : " + maxi);
		
	}
}

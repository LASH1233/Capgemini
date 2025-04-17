package capgemini;

public class SumRowColumn {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{3,4,5}};
		for(int i=0;i<arr.length;i++) {
			int rowSum = 0;
			for(int j=0;j<arr[0].length;j++) {
				
				rowSum += arr[i][j];
			}

			System.out.println("sum of " + i + "th row : " + rowSum);
		}
		for(int i=0;i<arr[0].length;i++) {
			int Sum = 0;
			for(int j=0;j<arr.length;j++) {
				 
				Sum += arr[j][i];
			}

			System.out.println("sum of " + i + "th column : " + Sum);
		}


	}
}

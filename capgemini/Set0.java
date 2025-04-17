package capgemini;

//import java.util.Scanner;
import java.util.Arrays;

public class Set0 {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
		int[][] temp = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				temp[i][j]=matrix[i][j];
			}
		}
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[0].length; j++) {
				if (matrix[i][j] == 0) {
					for(int k=0;k<matrix[0].length;k++) {
						temp[i][k] = 0;
					}
					for(int k=0;k<matrix.length;k++) {
						temp[k][j] = 0;
					}
				}
			}
		}
		
		for (int[] a : temp) {
			System.out.println(Arrays.toString(a));
		}
	}
}

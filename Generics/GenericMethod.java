package Generics;

public class GenericMethod {
	 public static <T> void printArray(T[] arr) {
		for(T i: arr) {
			System.out.println(i+"\t");
		}
	}
	public static void main(String[] args) {
		Integer[] arr= {1,2,3,4,5};
		printArray(arr);
	}

}

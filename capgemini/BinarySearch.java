package capgemini;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        int target = 5;
        binarySearch(arr, target);
    }

    public static void binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                System.out.println("Element found at index: " + mid);
                return;  
            }
            else if (arr[mid] > target) {
                end = mid - 1;  
            } 
            else {
                start = mid + 1;  
            }
        }

        System.out.println("Element not found.");
    }
}

package capgemini;

import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num =sc.nextInt();
		int evenCount = 0;
		int oddCount = 0;
		while(num>0) {
			int ld = num%10;
			if(ld%2==0) {
				evenCount++;
			}
			else if(ld%2!=0){
				oddCount++;
			}
			num/=10;
		}
		System.out.println(evenCount*oddCount);
	}
}

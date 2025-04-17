package capgemini;

import java.util.Scanner;

public class StringName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[4];
		for(int i=0;i<4;i++) {
			name[i] = sc.next();
		}
		for(String s : name) {
			System.out.print(s + " ");
		}
	}
}

package ArrayList;

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(3, 40);
		a.set(1, 201);
		Object[] obj=a.toArray();
		Integer[] arr = new Integer[10];
		Integer[] i=a.toArray(arr);
		int value=a.get(1);
		System.out.println(value);
		System.out.println(a);
		
	}
}

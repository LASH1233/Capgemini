package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
	public static void main(String[] args) {
		List<Integer> a1 = new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		System.out.println("a1: " + a1);
		ArrayList<Integer> a2=new ArrayList<>();
		a2.addAll(a1);
		a2.add(101);
		a2.add(201);
		System.out.println("a2: "+a2);
		System.out.println("a2.containsAll(a1): "+a2.containsAll(a1));
		a2.remove(1);
		System.out.println("a2: "+a2);
		System.out.println("a2.containsAll(a1): "+a2.containsAll(a1));

	}
}

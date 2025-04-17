package Set;

//import java.util.Arrays;
import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<Integer> h = new HashSet<Integer>();
		Set<Integer> h2 = new HashSet<Integer>();
		h.add(10);
		h.add(20);
		h.add(30);
		h2.retainAll(h);
		System.out.println(h2);
		h.remove(20);
		
		System.out.println(h);
	}
}

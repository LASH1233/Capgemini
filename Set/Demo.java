package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
	public static void main(String[] args) {
		Set h = new TreeSet<>();
		h.add("hi");
		h.add(20);
//		h.add(null);
		System.out.println(h);
	}
}

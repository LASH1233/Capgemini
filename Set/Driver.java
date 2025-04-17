package Set;

import java.util.HashSet;

public class Driver {
	public static void main(String[] args) {
		HashSet<Student> h = new HashSet<Student>();
		Student s1 = new Student(1,"Anit",85.78);
		Student s2 = new Student(2,"Raj",86.78);
		h.add(s1);
		h.add(s2);
		h.add(s1);
		h.add(s2);
		System.out.println(h);
		
	}
}

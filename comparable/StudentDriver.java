package comparable;

import java.util.Arrays;

public class StudentDriver {
	public static void main(String[] args) {
		Student[] students= {
				new Student(8,"A",87.78),
				new Student(3,"R",77.78),
				new Student(6,"Af",67.78),
		};
		Arrays.sort(students);
		for(Student student:students) {
			System.out.println(student);
		}
	}
}

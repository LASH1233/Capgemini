package inheritance;

public class Driver1 {
	public static void main(String[] args) {
		Student s = new Student(12345);
		s.displayStudentDetails();
		Person p = new Person("Anit",21);
		p.displayPersonDetails();
		s.displayPersonDetails();
	}
}

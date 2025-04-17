package inheritance;

public class Student extends Person {
	private int student_id;


	Student(int student_id) {
		super();
		this.student_id = student_id;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id=student_id;
	}

	public void displayStudentDetails() {
		System.out.println(this.student_id);
	}
}


package nonPrimitiveTypeCasting;

public class Driver {
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = (Child) p;
		System.out.println(c.student_id);
	}
}

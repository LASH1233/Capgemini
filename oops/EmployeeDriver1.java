package oops;

public class EmployeeDriver1 {
	public static void main(String[] args) {
		Employee1 e = new Employee1();
		e.setName("Anit");
		e.setAge(22);
		e.setNumber(987456321l);
		e.setSalary(20000);
		System.out.println(e.getName());
		System.out.println(e.getAge());
		System.out.println(e.getNumber());
		System.out.println(e.getSalary());
		
	}
}

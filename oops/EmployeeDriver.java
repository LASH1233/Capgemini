package oops;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee e1 = new Employee("Anit");
		Employee e2 = new Employee("Amit",30000.00);
		Employee e3 = new Employee("Raj",30000.00,9877534210l);
		System.out.println(e1.name + " ");
		System.out.println(e2.name + " " + e2.salary);
		System.out.println(e3.name + " " + e3.salary + " " + e3.number);
	}
}

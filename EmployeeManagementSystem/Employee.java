package EmployeeManagementSystem;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private double salary;
	public Employee(int id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String toString() {
		System.out.println();
		return "Name: "+name+"\t"+"ID: "+this.id+"\t"+"Salary: "+this.salary+"\n";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	public boolean remove(Employee emp) {
		emp=null;
		return true;
	}
	@Override
	public int compareTo(Employee o) {
		return o.id-this.id;
	}

}

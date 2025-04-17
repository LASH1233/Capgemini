package oops;

public class Employee {
	String name;
	double salary;
	long number;
	Employee(){
		
	}
	Employee(String name){
		this.name = name;
	}
	Employee(String name,double salary){
		this.name = name;
		this.salary = salary;
	}
	Employee(String name,double salary,long number){
		this.name = name;
		this.salary = salary;
		this.number = number;
	}
}

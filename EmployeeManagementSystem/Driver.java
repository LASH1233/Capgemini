package EmployeeManagementSystem;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("---------Welcome----------");
		System.out.println("1-Add Employee");
		System.out.println("2-Print All Employee");
		System.out.println("3-Search Employee");
		System.out.println("4-Search Employee by ID");
		System.out.println("5-Delete Employee");
		System.out.println("6-Delete Employee by ID");
		System.out.println("7-Update Employee by ID");
		System.out.println("8-Sort Employee by ID");
		int choice=sc.nextInt();
			switch(choice) {
			case 1:{
				Employee emp=createEmployeeObject(sc);
				Employees.addEmployee(emp);
				break;
			}
			case 2:{
				Employees.printAllEmployees();
				break;
			}
			case 3: {
				Employee emp=createEmployeeObject(sc);
				boolean res=Employees.searchEmployeeByObject(emp);
				if(res==true) {
					System.out.println("Employee found");
				}else {
					System.out.println("Employee not found");
				}
				break;
			}
			case 4: {
				System.out.println("Enter id to search");
				int id=sc.nextInt();
				boolean res = Employees.searchById(id);
				if(res==true) {
					System.out.println("Employee found");
				}else {
					System.out.println("Employee not found");
				}
				break;
			}
			case 5:{
				Employee emp = createEmployeeObject(sc);
				Employees.removeObject(emp);
				break;
			}
			case 6: {
				System.out.println("Enter id to delete employee");
				Employees.removeByID(sc.nextInt());
				break;
			}
			case 7:{
				System.out.println("Enter id to update");
				int id=sc.nextInt();
				boolean res = Employees.searchById(id);
				if(res==true) {
					Employees.updateByID(id, sc);
				}else {
					System.out.println("Employee not found");
				}
				break;
			}
			case 8:{
				Employees.sort();
				break;
			}
				default:
					System.exit(0);
			}

		}
	
	}

	private static Employee createEmployeeObject(Scanner sc) {
		System.out.println("Enter id, name and Salary of Employee");
		Employee emp = new Employee(sc.nextInt(),sc.next(),sc.nextDouble());
		return emp;
	}
}

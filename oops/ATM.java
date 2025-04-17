package oops;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Account a1 = new Account();
		String choice;
		System.out.println("Welcome!");
		choice = sc.next();
		a1.setBalance(80000);
		a1.setName("Anit");
		a1.setNumber(1234546789l);
		while(choice!="exit") {
			switch(choice) {
			case "withdraw":{
				System.out.println("Enter amount to be withdrawn : ");
				double amount = sc.nextDouble();
				System.out.println("New Balance : " + a1.withdraw(amount)); 
				break;
			}
			case "deposit":{
				System.out.println("Enter amount to be depositd : ");
				double amount = sc.nextDouble();
				System.out.println("New Balance : " + a1.deposit(amount));
				break;
			}
			case "check balance":{
				a1.checkBalance(a1.getBalance());
				break;
			}
			case "exit":{
				System.out.println("Thank you!");
				break;
			}
			default:System.out.println("Enter a valid choice");
			break;
		}
		
		}
	}
}

package Generics;

import java.util.LinkedList;

public class Wildcarts2 {
	public static <T> void printLinkedlist(LinkedList<?> list) {
		for(Object i: list) {
			System.out.println(i+"\t");
		}
		Object i = list.get(0);
	}
	public static void main(String[] args) {
		LinkedList list1= new LinkedList();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list1.add(60);
		printLinkedlist(list1);
		
	}

}

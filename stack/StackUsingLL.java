package stack;

import java.util.EmptyStackException;

import linkedlist.SLL;

public class StackUsingLL {
	private SLL list;
	private int pointer=-1;
	public StackUsingLL() {
		list = new SLL();
	}
	public boolean push(int value) {
//		pointer++;
		return list.prepend(value);
	}
	public int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		int data=list.get(0);
		list.deleteAtfirst();
//		pointer--;
		return data;
	}
	public int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return list.get(0);
	}
	public boolean isEmpty() {
		return list.get(0)==-1;
	}
	public void display() {
		if(isEmpty())return;
		System.out.println(list.toString());
	}
}

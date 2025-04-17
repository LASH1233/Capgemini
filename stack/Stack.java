package stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
	private int[] data;
	private int pointer=-1;
	final private int initialCapacity=10;
	
	Stack(){
		data=new int[initialCapacity];
	}
	public boolean push(int value) {
		if(isFull()) {
			data=Arrays.copyOf(data, data.length*2);
		}
		pointer++;
		data[pointer]=value;
		return true;
	}
	public boolean isEmpty() {
		return pointer==-1;
	}
	public int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		int top=data[pointer];
		pointer--;
		return top;
	}
	public int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return data[pointer];
	}
	public boolean isFull() {
		return pointer==data.length-1;
	}
	public void display() {
		for(int i=0;i<=pointer;i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
}

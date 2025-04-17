package queue;

import java.util.Arrays;

public class Queue {
	private int[] data;
	private int pointer=-1;
	private int initialCapacity=10;
	
	Queue(){
		data=new int[initialCapacity];
	}
	Queue(int size) {
		data=new int[size];
	}
	public boolean isFull() {
		return pointer==data.length-1;
	}
	public boolean insert(int value) {
		if(isFull()) {
			data=Arrays.copyOf(data, data.length*2);
		}
		pointer++;
		data[pointer]=value;
		return true;
	}
	public boolean delete() {
		if(isEmpty()) {
			return false;
		}
		else {
			for(int i=1;i<=pointer;i++) {
				data[i-1]=data[i];
			}
		}
		pointer--;
		return true;
	}
	public boolean isEmpty() {
		return pointer==-1;
	}
	public void display() {
		for(int i=0;i<=pointer;i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
}

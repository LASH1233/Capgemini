package queue;

import java.util.EmptyStackException;

import linkedlist.SLL;

public class QueueusingLL {
	private SLL data;
	private int pointer=-1;
	public QueueusingLL() {
		data=new SLL();
	}
	public boolean isEmpty() {
		return pointer==-1;
	}
	public boolean insert(int value) {
	
		pointer++;
		return data.append(value);
	}
	public int delete() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		int value=data.get(0);
		data.deleteAtfirst();
		return value;
	}
	public void display() {
		if(isEmpty()) {
			return;
		}
		System.out.println(data.toString());
	}
}

package linkedlist;

import linkedlist.SLL.Node;

public class CircularLInkedList {
	private Node head;
	private Node tail;
	private int size;
	public int getSize() {
		return this.size;
	}
	public class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
		}
	}
	public boolean isEmpty() {
		return head==null&&tail==null;
	}
	public boolean append(int value) {
		Node node = new Node(value);
		if(isEmpty()) {
			head=node;
			tail=node;
			tail.next=head;
		}else {
			tail.next=node;
			tail=tail.next;
			tail.next=head;
		}
		size++;
		return true;
	}
	public boolean prepend(int value) {
		Node node = new Node(value);
		if(isEmpty()) {
			head=node;
			tail=node;
			tail.next=head;
		}else {
			node.next=head;
			head=node;
			tail.next=head;
		}
		size++;
		return true;
	}
	public boolean insert(int value,int index) {
		if(index<=0) {
			prepend(value);
		}else if(index>=size) {
			append(value);
		}else {
			Node node = new Node(value);
			Node prev=null;
			Node temp=head;
			int i=0;
			while(i!=index){
				prev=temp;
				temp=temp.next;
				i++;
			}
			prev.next=node;
			node.next=temp;
		}
		size++;
		return true;
	}
	public boolean deleteFirst() {
		if(isEmpty()) {
			return false;
		}
		else if(head.next==null) {
			head=null;
			tail=null;
		}else {
			head=head.next;
			tail.next=head;
		}
		size--;
		return true;
	}
	public boolean deleteLast() {
		if(isEmpty()) {
			return false;
		}
		else if(head.next==null) {
			head=null;
			tail=null;
		}else {
			Node temp=head;
			while(temp.next!=tail) {
				temp=temp.next;
			}
			temp.next=null;
			tail=temp;
			tail.next=head;
		}
		size--;
		return true;
	}
	public boolean delete(int value,int index) {
		if(isEmpty()||index<0||index>=size) {
			return false;
		}	
		else if(index==0){
			deleteFirst();
		}	else if(index==size-1) {
			deleteLast();
		}else {
			
			Node temp=head;
			Node prev=null;
			int i=0;
			while(i<index&&temp.next!=head) {
				prev=temp;
				temp=temp.next;
				i++;
			}
			if(i==index) {
				prev.next=temp.next;
				if(temp==tail) {
					tail=prev;
				}
				size--;
				return true;
			}
		}
		return false;
	}
	public boolean reverse() {

	    Node prev = null;
	    Node current = head;
	    Node next = null;
	    Node tail = head;

	    while (tail.next != head) {
	        tail = tail.next;
	    }

	    do {
	        next = current.next;
	        current.next = prev;
	        prev = current;
	        current = next;
	    } while (current != head);

	    tail.next = prev;
	    head = prev;

	    return true;
	}
	public boolean update(int index,int value) {
		Node current = head;

	    do {
	        if (current.value == value) {
	            current.value = value; 
	            return true; 
	        }
	        current = current.next;
	    } while (current != head); 

	    return false; 
	}
	public void display() {
		if(isEmpty())return;
		StringBuffer sb = new StringBuffer("{");
		Node temp=head;
		do {
			sb.append(temp == tail?temp.value : temp.value+" , ");
			temp=temp.next;
		}while(temp!=head);
		sb.append("}");
		System.out.println(sb);

	}

}

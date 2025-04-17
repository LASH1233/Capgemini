package linkedlist;

import linkedlist.SLL.Node;

public class DoublyLL {
	private Node head;
	private Node tail;
	private int size;
	
	public boolean isEmpty() {
		return head==null&&tail==null;
	}
	public boolean append(int value) {
		Node node = new Node(value);
		if(isEmpty()) {
			head=node;
			tail=node;
			head.next=tail;
			head.prev=null;
			tail.prev=head;
			tail.next=null;
		}else {
			tail.next=node;
			node.prev=tail;
			tail=node;
			tail.next=null;
		}
		size++;
		return true;
	}
	public boolean prepend(int value) {
		Node node = new Node(value);
		if(isEmpty()) {
			head=node;
			tail=node;
			head.next=tail;
			head.prev=null;
			tail.prev=head;
			tail.next=null;
		}else {
			node.prev=null;
			node.next=head;
			head=node;
		}
		size++;
		return true;
	}
	public boolean insert(int index,int value) {
		if(index<=0) {
			return prepend(value);
		}else if(index>=size) {
			return append(value);
		}else {
			Node node = new Node(value);
			Node prev=null;
			Node temp=head;
			int i=0;
			while(i!=index) {
				prev=temp;
				temp=temp.next;
				i++;
			}
			prev.next=node;
			node.prev=prev;
			node.next=temp;
		}
		size++;
		return true;
	}
	public boolean deleteFirst() {
		if(isEmpty()) {
			return false;
		}else if(head.next==null) {
			head=null;
			tail=null;
		}else {
			head=head.next;
			head.prev=null;
		}
		size--;
		return true;
	}
	public boolean deleteAtLast() {
		if(isEmpty()) {
			return false;
		}
		else if(head==tail) {
			head=null;
			tail=null;
		}else {
			Node temp=head;
			while(temp.next!=tail) {
				temp=temp.next;
			}
			tail=tail.prev;
			tail.next=null;
		}
		size--;
		return true;
	}
	public boolean update(int oldValue,int value) {
		Node current = head;

	    while(current!=tail){
	        if (current.value == oldValue) {
	            current.value = value; 
	            return true; 
	        }
	        current = current.next;
	    }
	    return false;
	}
	public int search(int value) {
		Node temp=head;
		int i=0;
		while(i!=size-1) {
			if(temp.value==value) {
				return i;
			}
			i++;
			temp=temp.next;
		}
		return -1;
	}
//	public boolean delete(int index) {
//		if(isEmpty()||index<0||index>=size) {
//			return false;
//		}
//		else if(index==0) {
//			return deleteFirst();
//		}else if(index == size-1) {
//			return deleteAtLast();
//		}else {
//			Node temp=head;
//			Node prev=null;
//			int i=0;
//			while(i!=index-1) {
//				prev=temp;
//				temp=temp.next;
//				i++;
//			}
//			temp=temp.next;
//			prev.next=temp;
//			temp.prev=prev;
//		}
//		size--;
//		return true;
//	}
	public void displayReverse() {
		Node temp=head;
		while(temp!=null) {
			temp=temp.next;
		}
		while(temp!=null) {
			System.out.print(temp.value+" ");
			temp=temp.prev;
			if(temp==null)break;
		}
		System.out.println();
	}
	public void display() {
		Node temp=head;
		StringBuffer sb = new StringBuffer("{");
		
		while(temp!=null) {
			sb.append(temp == tail?temp.value : temp.value+" , ");
			temp=temp.next;
		}
		sb.append("}");
		System.out.println(sb);
	}
	private class Node{
		int value;
		Node prev;
		Node next;
		
		Node(int value){
			this.value=value;
		}
	}
	
}

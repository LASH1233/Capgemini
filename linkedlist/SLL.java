package linkedlist;

public class SLL {
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
			size++;
			
		}else {
			tail.next=node;
			tail=node;
			size++;
		}
		return true;
	}
	public boolean prepend(int value) {
		Node node = new Node(value);
		if(isEmpty()) {
			head=node;
			tail=node;
			size++;
		}
		else {
			node.next=head;
			head=node;
			size++;
		}
		return true;
	}
	public boolean addAtIndex(int value,int index) {
		if(index<=0) {
			return prepend(value);
		}else if(index>=size) {
			return append(value);
		}
		else {
//			Node current = head;
//			for(int i=0;i<index-1;i++) {
//				current=current.next;
//			}
//			node.next=current.next;
//			current.next=node;
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
			node.next=temp;
		}
		size++;
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
			temp.next=null;
			tail=temp;
		}
		size--;
		return true;
	}
	public boolean deleteAtfirst() {
		if(isEmpty()) {
			return false;
		}
		else if(head.next==null) {
			head=null;
			tail=null;
		}else {
			head=head.next;
		}
		size--;
		return true;
	}
	public boolean delete(int index) {
		if(isEmpty()||index<0||index>=size) {
				return false;
		}	
		else if(index==0){
			deleteAtfirst();
		}else if(index==size-1) {
			deleteAtLast();
		}else {
			Node temp=head;
			int i=0;
			while(i!=index-1) {
				temp=temp.next;
				i++;
			}
			temp.next=temp.next.next;
			if(temp.next==null) tail=temp;
		}
		size--;
		return true;
	}
	public boolean update(int index,int value) {
		if(index<=0) {
			return false;
		}else if(index>=size-1) {
			return false;
		}
		else {
			Node temp=head;
			while(temp!=null) {
				temp=temp.next;
			}
			temp.value=value;
			return true;
		}
	}
	public boolean reverse() {
		Node prev=null;
		Node current=head;
		Node next=null;
		tail=head;
		while(current!=null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
//		Node temp=head;
//		head=tail;
//		tail=temp;
		head=prev;
		return true;	
	}
	public int get(int index) {
		if(index < 0||index >= size) throw new IndexOutOfBoundsException();
		Node temp=head;
		int i=0;
		while(i!=index) {
			temp=temp.next;
			i++;
		}
		return temp.value;
	}
	public int search(int value) {
		Node current=head;
		int i=0;
			while(current!=null) {
				if(current.value==value) {
					return i;
				}
				current=current.next;
				i++;
			}
		return -1;
		
	}
	public String toString() {
		Node temp=head;
		StringBuffer sb = new StringBuffer("{");
		
		while(temp!=null) {
			sb.append(temp == tail?temp.value : temp.value+" , ");
			temp=temp.next;
		}
		sb.append("}");
		return sb.toString();
	}
}

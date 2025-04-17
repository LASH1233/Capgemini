package linkedlist;

public class CLLDriver {
	public static void main(String[] args) {
		CircularLInkedList list = new CircularLInkedList();
		list.append(10);
		list.append(20);
		list.append(30);
		list.prepend(40);
		list.insert(50, 2);
//		list.deleteFirst();
//		list.deleteLast();
//		list.delete(10, 1);
		list.display();
		list.reverse();
	}
}

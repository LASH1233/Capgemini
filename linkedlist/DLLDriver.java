package linkedlist;

public class DLLDriver {
	public static void main(String[] args) {
		DoublyLL list = new DoublyLL();
		list.append(10);
		list.append(20);
		list.append(30);
		list.prepend(40);
		list.insert(1, 50);
		list.display();
//		list.deleteFirst();
//		list.deleteAtLast();
//		list.delete(1);
		list.update(50,10);
//		System.out.println(list.search(20));
		list.displayReverse();
//		list.display();
	}
}

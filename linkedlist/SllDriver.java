package linkedlist;

public class SllDriver {
	public static void main(String[] args) {
		SLL list = new SLL();
		list.append(10);
		list.append(20);
		list.append(30);
		list.prepend(50);
		list.prepend(60);
		list.addAtIndex(40, 2);
		System.out.println(list.getSize());
		System.out.println(list);
//		list.update(3, 70);
//		list.reverse();
		System.out.println(list.get(2));
//		System.out.println(list.search(30));
//		list.deleteAtfirst();
//		list.deleteAtLast();
//		list.delete(2);
//		System.out.println(list);
	}
}

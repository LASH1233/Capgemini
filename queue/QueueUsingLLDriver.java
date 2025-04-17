package queue;

public class QueueUsingLLDriver {	
	public static void main(String[] args) {
		QueueusingLL q = new QueueusingLL();
		q.insert(10);
		q.insert(20);
		q.insert(30);
		q.insert(40);
		q.display();
		System.out.println(q.delete());
	}
}

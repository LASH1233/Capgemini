package stack;

public class StackDriver {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.display();
		System.out.println(s.pop());
		s.display();
		System.out.println(s.peek());
	}
}

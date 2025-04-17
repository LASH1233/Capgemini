package stack;

public class StackUsingLLDriver {
	public static void main(String[] args) {
		StackUsingLL stack = new StackUsingLL();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack.pop());
		System.out.println(stack.peek());
//		System.out.println(stack.pop());
		stack.display();
	}
}

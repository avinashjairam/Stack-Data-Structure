public class Test{
	public static void main(String [] args){
		Stack stack = new Stack();

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);

		System.out.println("top of the stack " + stack.top());

		System.out.println(stack.pop() + " popped from the stack");

		System.out.println("top of the stack " + stack.top());
	}
}
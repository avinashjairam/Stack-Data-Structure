//Driver Program to implement the Linked List with a Stack
public class Test{
	public static void main(String [] args){
		StackLinkedList list = new StackLinkedList();

		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);


		System.out.println("Size of list is: " + list.getSize());

		System.out.println("top of list is: " + list.top());

		System.out.println("popping " + list.pop());

		System.out.println("Size of list is: " + list.getSize());


		System.out.println("top of list is: " + list.top());

		System.out.println("popping " + list.pop());

		System.out.println("top of list is: " + list.top());



	}
}
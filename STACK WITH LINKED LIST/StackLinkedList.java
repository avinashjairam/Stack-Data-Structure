//Stack Data Structure implement in Java using a linked list

public class StackLinkedList{
	//The head node and the counter is set to 0
	Node head;
	int count = 0; //This is a count of the number of nodes in the list

	//The head of the list is null when the stack is first created.
	public StackLinkedList(){
		head = null;
	}

	//The push method accepts the item to be added to the stack as a parameter 
	public void push(int data){
		Node newNode = new Node(data); // creating the new node
		count++;	//incrementing the counter

		if(head == null){ 			//If the list is empty, set the head of the list to be the new node
			head = new Node(data);
			return;
		}

		Node temp = head;
		head = newNode;
		head.next = temp; 
		
	}

	//The pop method works in a Last In First Out Fashion
	public int pop(){
		
		int x = -1; //Be default, the value to be removed is -1

		count--;

		Node temp = head;
		x = temp.data;
		head = temp.next;

		return x;
	}

	//Returns the size of the list
	public int getSize(){
		return count;
	}

	//Returns the element at the top of the stack
	public int top(){
		//To get the top we need to get the last element that was inserted into the list
		if(head == null){
			return -1;
		}
		else{
			return head.data;
		}
	}


}
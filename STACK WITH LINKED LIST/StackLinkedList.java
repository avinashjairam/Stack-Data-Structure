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
		
		// Node last = head;		//Otherwise, we need to move to the end of the list to add the node
		// newNode.next = null;    //Setting the next reference of the new node to null since it is at the back of the list

		// //Traverse the list to get to the end
		// while(last.next != null){
		// 	last = last.next;		//Moving on the next node in the list 
		// }

		// last.next = newNode; //Setting the next pointer of the last node in the list to the new node
	}

	//The pop method works in a Last In First Out Fashion
	public int pop(){
		
		int x = -1; //Be default, the value to be removed is -1

		// //The two Node objects last and prev are need to find the last element in the list 
		// //Initially last is set to the head of the list and prev is set to null
		// Node last = head; 
		// Node prev = null;

		// //If last = null then the stack is empty. 
		// if(last == null){ 
		// 	return -1;
		// }

		// //While the next node in the list is not last, set prev to the current node
		// //(last) and set the current node (last ) to the next node
		// while(last.next != null){
		//  	prev = last;
		//  	last = last.next;
		//  }

		//  //Setting last node in the list to the penultimate node
		// last = prev;
		// //Assigning the value of the last node in the list to X. This is the node to be removed
		// x = last.next.data;
		// //Setting the last value to null
		// last.next = null;

		// //Decrementing the count
		count--;

		Node temp = head;
		x = temp.data;
		head = temp.next;

		return x;
	}

	public int getSize(){
		return count;
	}

	public int top(){
		//To get the top we need to get the last element that was inserted into the list
		if(head == null){
			return -1;
		}
		else{
			// Node last = head;

			// while(last.next != null){
			// 	last = last.next;
			// }

			 return head.data;
		}
	}


}
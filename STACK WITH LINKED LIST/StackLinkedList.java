public class StackLinkedList{
	Node head;
	int count = 0;

	public StackLinkedList(){
		head = null;
	}

	public void push(int data){
		Node newNode = new Node(data);

		count++;

		if(head == null){
			head = newNode();
		}
		
		Node last = head;
		
		//Traverse the list to get to the end
		while(last != null){
			last = last.next;
		}

		last.next = newNode;
	}

	public int pop(){
		//Traverse the list to get to the end 
		if(head == null){
			return -1;
		}

		Node last = head;
		Node prev = null;

		while(last != null){
			prev = last; 
			last = last.next;
		}

		prev.next = null;

		count--;
		return last.data;
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
			Node last = head;

			while(last.next != null){
				last = last.next;
			}

			return last.data;
		}
	}


}
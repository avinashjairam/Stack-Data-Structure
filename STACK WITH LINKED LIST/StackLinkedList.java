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
			head = new Node(data);
			return;
		}
		
		Node last = head;
		newNode.next = null;

		//Traverse the list to get to the end
		while(last.next != null){
			//System.out.print(last.data + " ");
			last = last.next;
		}

		System.out.println();
		last.next = newNode;
	}

	public int pop(){
		//Traverse the list to get to the end 
		int x = -1;
		

		Node last = head;
		Node prev = null;

		if(last == null){
			return -1;
		}

		while(last.next != null){
		 	prev = last;
		 	last = last.next;
		 	System.out.print("prev " + prev.data + " last " + last.data);				
		 }
		last = prev;
		x = last.next.data;
		last.next = null;

		System.out.println();
	
		count--;
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
			Node last = head;

			while(last.next != null){
				last = last.next;
			}

			return last.data;
		}
	}


}
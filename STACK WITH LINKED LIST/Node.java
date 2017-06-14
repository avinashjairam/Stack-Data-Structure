//The Node class 
//Has two properties: the data and a reference to the next node in the list
public class Node{
	int data;
	Node next;

	//The constructor initializes the data of the node and set the reference to the next node to null by default
	public Node(int data){
		this.data = data;
		next = null;
	}
}
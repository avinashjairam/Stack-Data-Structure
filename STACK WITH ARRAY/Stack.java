//Java program to implement basic Stack Operations:
//push, pop, top (peek), isEmpty()
public class Stack{
	static final int MAX = 1000;
	int top;
	int a [] = new int [MAX]; //Maximum size of the Stack

	boolean isEmpty(){
		return (top < 0);
	}

	public Stack(){
		top = -1;
	}

	public boolean push(int x){
		if(top > MAX){
			System.out.println("Stack Overflow");
			return false;
		}
		else{
			a[++top] = x; 
			return true;
		}
	}

	public int pop(){
		if(top < 0){
			System.out.println("Stack Underflow");
			return 0;
		}
		else{
			int x = a[top--];
			return x;
		}
	}

	public int top(){
		if(top == -1){
			return -1;
		}
		else{
			return a[top];
		}
	}

}
package sep;

public class shivStack01A {
	
	private int arr[];
	int size;
	private int top = -1; 
	
	//Create Constructor
	public shivStack01A(int size) {
		this.size = size;
		arr = new int[size];
	}
	
	
	//create A stack Push 
	public void push(int elem) {
		if (top == size-1) {
			System.out.println("Stack is Full");
		}
		else {
			top++;
			arr[top] = elem;
 		}
	}
	
	//create A Stack Pop
	public void pop() {
		if (top == -1) {
			System.out.println("Stack is Empty");
		}
		else {
			System.out.println("Elememt deleted is " + arr[top]);
			--top;
		}
	}
	
	//Display Stack 
	
	public void display() {
		 for (int i = top; i >= 0;i--) {
			 System.out.println(arr[i]);
		 }
	}
}

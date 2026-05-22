package may;

public class stackDS {

	private int arry[];
	int size;
	private int top = -1;
	
	//Create the Constructor
	public stackDS(int size) {
		this.size = size;
		arry = new int[size];
		
	}
	
	//Create the Push 
	
	public void push(int element) {
		if (top == size-1) {
			System.out.println("The Stack is Full");
		}
		else {
			top++;
			arry[top] = element;
		}
	}
	
	public void pop() {
		if(top == -1) {
			System.out.println("Stsock is Empty");
		} else {
			System.out.println("Element Deleted is " + arry[top]);
			top--;
		}
	}
	
	public void dispaly() {
		for (int i = top; i >= 0; i--) {
			System.out.println(arry[i]);
		}
	}
}

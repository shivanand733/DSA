package sep;

public class shivQueue01B {

	private int arr[];
	int size;
	
	private int forunt = -1;
	private int rare = -1;
	
	public shivQueue01B(int size) {
		this.size = size;
		arr = new int[size];
	}  	

	//create Queue  push 
	public void rare(int elem) {
		if (forunt == -1 && rare == size-1) {
			System.out.println("The Queue is Full..");
		}
		else {
			rare++;
			arr[rare] = elem;
		}
	}
	
	//Create Queue POP
	public void pop() {
		if ((forunt == -1 && rare == -1)|| (forunt == size-1 && rare == size-1)) {
			System.out.println("The Queue is Empty");
		}
		
		else {
			System.out.println("Elemet is Deleted " + arr[forunt]);
			--forunt;
		}
	}
	
	public void dispaly() {
		for (int i = rare; i>= 0; i--) {
			System.out.println(arr[i]);
		}
	}

}

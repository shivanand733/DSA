package S1Feb;

public class Pen {

	String name;
	int cost;
	String penType;
	
	//default Constructor 
	public Pen() {
		// TODO Auto-generated constructor stub
	}
	
	//parametrized constructors 
	public Pen(String name, int cost, String penType) {
		this.name = name;
		this.cost = cost;
		this.penType = penType;
	}

	@Override
	public String toString() {
		return "Pen [name=" + name + ", cost=" + cost + ", penType=" + penType + "]";
	}
	

}

package S1Feb;

public class book {

	String bookName;
	int cost;
	
	public book(String bookName, int cost) {
		// TODO Auto-generated constructor stub
		this.bookName = bookName;
		this.cost = cost;
	}
	public book() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "[bookName = " + bookName + ", cost = " + cost + "]";
	}
	
}

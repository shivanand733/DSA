package S1Feb;

public class shivMicroNova {

	int empNo;
	String name;
	String department;
	String depHead;
	
	public shivMicroNova() {
		// default constructor 
	}
	
	public shivMicroNova(int empNo, String name,String department,String depHead) {
		this.empNo = empNo;
		this.name = name;
		this.department = department;
		this.depHead = depHead;
	}

	@Override
	public String toString() {
		return "shivMicroNova [empNo=" + empNo + ", name=" + name + ", department=" + department + ", depHead="
				+ depHead + "]";
	}
	
}


public class Encapsulation {
	
	public static void main(String[] args) {
		Encapsulation a = new Encapsulation();
		
		a.setEmpAge(2);
		
		System.out.println(a.getEmpAge());
	}
	
	private String empName;
	private int ssn;
	private int empAge;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
}
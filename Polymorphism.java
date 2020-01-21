class Employee{
	String details(String name, int age) {
		String s = "Employee name: " + name + "\nEmplyee age: "+ age + "\n";
		return s;
	}
	
	String details(String name, int age, int SSN) {
		String s = "Employee name: " + name + "\nEmplyee age: "+ age + "\nEmplyee SSN: "+ SSN +"\n";
		return s;
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		Employee a = new Employee();
		
		System.out.println(a.details("Mario", 33));
		System.out.println(a.details("Luigi", 31, 123456));
	}
}
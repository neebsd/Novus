public class Inheritance {

	public static void main(String[] args) {
		int a = 20;
		int b = 16;
		
		AdvancedCalculate calc = new AdvancedCalculate();
		System.out.println(calc.add(a, b));
		System.out.println(calc.sub(a, b));
		System.out.println(calc.multiply(a, b));
		System.out.println(calc.divide(a, b));
	}
}

class Calculate{
	int add(int a, int b) {
		int sum = a + b;
		return sum;
	}
	int sub(int a, int b) {
		int subtract = a - b;
		return subtract;
	}
}

class AdvancedCalculate extends Calculate{
	int multiply(int a, int b) {
		int product = a * b;
		return product;
	}
	float divide(int a, int b) {
		float div = (float) a / b;
		return div;
	}
}
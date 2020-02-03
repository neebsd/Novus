package Homework;
import java.util.LinkedList;
import java.util.Scanner;

public class NumberSwitch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int num = scan.nextInt();
		
		System.out.println("Your number translated to words is: " + translate(num));
	}
	
	public static String translate(int n) {
		LinkedList<Integer> stack = new LinkedList<Integer>();
		String text = "";
		
		while(n > 0) {
			stack.push(n % 10);
			n /= 10;
		}
		
		while(!stack.isEmpty()) {
			int temp = stack.pop();
			
			switch(temp) {
				case 0:
					text += "Zero ";
					break;
				case 1:
					text += "One ";
					break;
				case 2:
					text += "Two ";
					break;
				case 3:
					text += "Three ";
					break;
				case 4:
					text += "Four ";
					break;
				case 5:
					text += "Five ";
					break;
				case 6:
					text += "Six ";
					break;
				case 7:
					text += "Seven ";
					break;
				case 8:
					text += "Eght ";
					break;
				case 9:
					text += "Nine ";
					break;
			}
		}
		return text;
	}
}

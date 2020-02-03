package Homework;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class NameSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your names, separate them with a comma and space: ");
        String names = scan.nextLine();

        //Splitting intiial input into the names
        String[] nameList = names.split(", ");
        LinkedList<String> sorted = new LinkedList<>();

        //Add the names to the linked list
        for (int i = 0; i < nameList.length; i++){
            sorted.addLast(nameList[i]);
        }

        Collections.sort(sorted);

        //Print sorted list
        System.out.println("The Sorted list: ");
        for (int i = 0; i <sorted.size(); i++){
            System.out.print(sorted.get(i) + " ");
        }
    }
}

package Homework;

import java.util.Scanner;

public class Alphabet {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number:  ");
        int n = in.nextInt();
        int count = 1;
        int no_of_spaces = 1;
        char letter = 'A';

        for (int i = 1; i < (n * 2); i++) {
            //System.out.println("letter: " + letter);
            for (int spc = n - no_of_spaces; spc > 0; spc--) {
                System.out.print(" ");
            }

            if (i < n) {        //for number
                no_of_spaces++;    //for spaces
            } else {
                no_of_spaces--;      //for space
            }

            for (int j = 0; j < count; j++) {
                System.out.print(letter);
                if (j < count / 2) {
                    letter--;
                    //System.out.println(letter);
                } else {
                    letter++;
                }
            }
            if (i < n) {
                count = count + 2;
            } else {
                count = count - 2;
            }
            System.out.println();
        }
    }
}
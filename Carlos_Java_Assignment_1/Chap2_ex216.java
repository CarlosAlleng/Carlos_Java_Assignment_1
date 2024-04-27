/*Write an application that asks the user to enter two integers,
 
obtains them from the user and displays the larger number followed 

by the words "is larger". If the numbers are equal, print the message

"These numbers are equal". */


import java.util.Scanner;

public class Chap2_ex216 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asks the user to enter first integer
        System.out.print("Enter an integer: ");
        int num1 = input.nextInt();

        // Asks the user to enter second integer
        System.out.print("Enter another integer: ");
        int num2 = input.nextInt();

        // Displays the larger number followed by the words "is larger"
        if (num1 > num2) {
            System.out.println(num1 + " is larger");
        } else if (num1 < num2) {
            System.out.println(num2 + " is larger");
        } else {
            System.out.println("These numbers are equal");
        }
        
        // Close the Scanner
        input.close();
    }
}

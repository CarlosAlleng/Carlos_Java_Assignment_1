/*(Find the Smallest Value) Write an application that finds 
the smallest of several integers. Assume that the first value 
read specifies the number of values to input from the user.*/


import java.util.Scanner;

public class Chap5_ex511{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of values to input
        System.out.print("Enter the number of values: ");
        int numValues = scanner.nextInt();

        // Initialize the smallest value
        int smallestValue = Integer.MAX_VALUE;

        // Get and find the smallest value
        for (int i = 0; i < numValues; i++) {
            System.out.print("Enter a value: ");
            int value = scanner.nextInt();
            smallestValue = Math.min(smallestValue, value);
        }

        // Display the smallest value
        System.out.println("The smallest value is: " + smallestValue);

        scanner.close();
    }
}
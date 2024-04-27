// Write an application that inputs three integers from the user and displays the sum, average, product, smallest and largest of the numbers. [Note: The calculation of the average in this exercise should result in an integer representation of the average

import java.util.Scanner;

public class Chap2_ex217 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third integer: ");
        int num3 = input.nextInt();

        // Calculate sum, average, product, smallest and largest
        int sum = num1 + num2 + num3;
      
        // Division to get integer average
        int average = sum / 3; 
        
        //Product calculation
        int product = num1 * num2 * num3;

        // Find smallest and largest numbers
        int smallest = Math.min(Math.min(num1, num2), num3);
        int largest = Math.max(Math.max(num1, num2), num3);

        // Display the results
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Product: " + product);
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);

      input.close();
    }
}
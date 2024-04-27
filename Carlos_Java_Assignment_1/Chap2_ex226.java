/* Write an application that reads two integers, 

determines whether the first is a multiple of the 

second and prints the result.*/

import java.util.Scanner;

public class Chap2_ex226 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
   
    // Prompt the user to enter first integer
    System.out.print("Enter the first integer: ");
    int firstNumber = scanner.nextInt();

    // Prompt the user to enter second integer
    System.out.print("Enter the second integer: ");
    int secondNumber = scanner.nextInt();

    // Check if the number is odd or even
    if (firstNumber % secondNumber == 0) {
    System.out.println(firstNumber + " is a multiple of " +       secondNumber);
    } 
    else {
    System.out.println(firstNumber + " is not a multiple of "     + secondNumber);

    scanner.close();

    }
    
  }
  
}
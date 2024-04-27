 /* Write an application that reads an integer and determines and prints whether it’s odd or even.*/

 import java.util.Scanner;

 public class Chap2_ex225 {
 
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
 
         System.out.print("Enter an integer: ");
         int number = input.nextInt();
 
         // Check if the number is even or odd
         if (number % 2 == 0) {
             System.out.println(number + " is even.");
         } else {
             System.out.println(number + " is odd.");
         }
 
         input.close();
     }
 }
 
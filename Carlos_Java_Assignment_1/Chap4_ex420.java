/*Develop a Java application that determines the 
gross pay for each of three employees. The company 
pays straight time for the first 40 hours worked by 
each employee and time and a half for all hours worked 
in excess of 40. You’re given a list of the employees, 
their number of hours worked last week and their hourly rates. 
Your program should input this information for each employee, 
then determine and display the employee’s gross pay. Use class Scanner to input the data.*/

import java.util.Scanner;

public class Chap4_ex420 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get employee information for 3 employees
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter employee " + (i + 1) + " information:");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Hours worked: ");
            double hoursWorked = scanner.nextDouble();
            System.out.print("Hourly rate: ");
            double hourlyRate = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            // Calculate gross pay
            double grossPay = calculateGrossPay(hoursWorked, hourlyRate);

            // Display employee information and gross pay
            System.out.println("\nEmployee " + name + ":");
            System.out.println("Hours worked: " + hoursWorked);
            System.out.println("Hourly rate: $" + hourlyRate);
            System.out.println("Gross pay: $" + grossPay);
        }

        scanner.close();
    }

    // Method to calculate gross pay
    private static double calculateGrossPay(double hoursWorked, double hourlyRate) {
        double regularHours = Math.min(hoursWorked, 40);
        double overtimeHours = Math.max(0, hoursWorked - 40);
        return regularHours * hourlyRate + overtimeHours * hourlyRate * 1.5;
    }
}


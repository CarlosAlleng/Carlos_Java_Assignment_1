/*Write a test app named EmployeeTest that demonstrates class Employee’s capabilities.
 Create two Employee objects and display each object’s yearly salary. Then give each
  Employee a 10% raise and display each Employee’s yearly salary again.*/

public class EmployeeTest {
    public static void main(String[] args) {
        // Create two Employee objects
        Employee employee1 = new Employee("John", "Doe", 5000);
        Employee employee2 = new Employee("Jane", "Smith", 6000);

        // Display initial yearly salaries
        System.out.println("Employee 1 yearly salary: " + calculateYearlySalary(employee1));
        System.out.println("Employee 2 yearly salary: " + calculateYearlySalary(employee2));

        // Give each employee a 10% raise
        employee1.setMonthlySalary(employee1.getMonthlySalary() * 1.10);
        employee2.setMonthlySalary(employee2.getMonthlySalary() * 1.10);

        // Display updated yearly salaries
        System.out.println("\nEmployee 1 yearly salary after raise: " + calculateYearlySalary(employee1));
        System.out.println("Employee 2 yearly salary after raise: " + calculateYearlySalary(employee2));
    }

    // Helper method to calculate yearly salary
    private static double calculateYearlySalary(Employee employee) {
        return employee.getMonthlySalary() * 12;
    }
}
/*Create a class called Employee that includes three instance 
variables—a first name (type String), a last name (type String) and 
a monthly salary (double). Provide a constructor that initializes the
 three instance variables. Provide a set and a get method for each instance variable.
  If the monthly salary is not positive, do not set its value. */


public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;

        // Only set monthlySalary if it is positive
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }
}
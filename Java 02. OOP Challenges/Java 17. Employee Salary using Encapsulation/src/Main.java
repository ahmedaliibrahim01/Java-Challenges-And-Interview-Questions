// Replace ___ with your code
import java.util.Scanner;

// create a class Employee
class Employee {

    // create a private field
    ___

    // create a method to set salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // create a method to get salary
    public double getSalary() {
        return this.salary;
    }
}

class Main {

    // main method
    public static void main(String[] args) {

        // get input value for the salary
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();

        // create an object of Employee
        ___

                // initialize the value of the salary field using setter method
                ___

        // get the value of the salary field using the getter method
        ___

        // print the salary
        System.out.println(result);

        input.close();
    }
}
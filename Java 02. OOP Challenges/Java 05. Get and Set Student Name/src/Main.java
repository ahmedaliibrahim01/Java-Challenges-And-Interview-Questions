// Replace ___ with your code
import java.util.Scanner;

class Student {

    // private field
    private String name;

    // setter method
    public void setName(String name) {
        System.out.println("Setting Name");

        // initialize value of name using this
        ___
    }

    // getter method
    public String getName() {
        System.out.println("Getting Name");

        // return the value of name using this
        ___
    }
}

// Main class
class Main {

    // main method
    public static void main(String[] args) {

        // get input value for name
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        // create an object of Student
        Student s1 = new Student();

        // call setter method
        ___

        // call getter method
        String returnedValue = ___;

        // print the returned value
        System.out.println(returnedValue);

        input.close();
    }
}
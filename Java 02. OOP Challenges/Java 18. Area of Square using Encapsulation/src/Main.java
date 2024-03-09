// Replace ___ with your code
import java.util.Scanner;

// create a class named Square
___ {

    // create a private field
    ___

    // setter method
    public void setLength(int length) {

        // condition to check if length is greater than 0
        // if true, assign value of length to the private field length using this
        // otherwise, print Length of a square cannot be less than 0.
        ___
    }

    // create method to calculate area and print it
    ___
}

class Main {
    public static void main(String[] args) {

        // get input value for length
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();

        // create an object of Square
        ___

                // call the setter method with the length argument
                ___

        // call the calculateArea() method
        ___

        input.close();
    }
}
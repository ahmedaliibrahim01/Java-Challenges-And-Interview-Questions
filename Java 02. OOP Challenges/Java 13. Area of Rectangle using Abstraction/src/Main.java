// Replace ___ with your code
import java.util.Scanner;

// create an abstract class with an abstract method calculateArea()
___

// implement the Rectangle class from Polygon
class Rectangle ___ {
    int length;
    int breadth;

    // constructor to initialize length and breadth
    // Hint: Use this keyword
    Rectangle(int length, int breadth) {
        ___
                ___
    }

    // implement the abstract method
    // compute the area and print it
    ___
}

class Main {
    public static void main(String[] args) {

        // get input value for length and breadth
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int breadth = input.nextInt();

        // create an object of Rectangle with length and breadth arguments
        Rectangle rect = new Rectangle(length, breadth);

        // call the calculateArea() method using the object
        ___

        input.close();
    }
}
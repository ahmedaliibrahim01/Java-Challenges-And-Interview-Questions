// Replace ___ with your code
import java.util.Scanner;

// create an interface named Polygon with a method calculateArea()
___

// implement the Square class from Polygon
class Square ___ {
    int length;

    // constructor to initialize length
    Square(int length) {
        this.length = length;
    }

    // implement the method of the interface
    // compute the area of square and print it
    ___
}

class Main {
    public static void main(String[] args) {

        // get input value for the length
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();

        // create an object of Square with argument, length
        Square s1 = new Square(length);

        // call the calculateArea() method using the object
        ___

        input.close();
    }
}
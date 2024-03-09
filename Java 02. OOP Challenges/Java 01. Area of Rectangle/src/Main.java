// Replace ___ with your code
import java.util.Scanner;

class Rectangle {

    // integer fields
    int length;
    int breadth;

    // constructor of the class
    // initialize the value of length and breadth
    Rectangle(___, ___) {
        ___;
        ___;
    }

    // method to compute the area of rectangle
    void calculateArea() {
        int area = length * breadth;
        System.out.println(area);
    }
}

class Main {
    public static void main(String[] args) {

        // input values for x and y
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        // create an object of Rectangle with arguments x and y
        Rectangle obj = ___;

        // call the calculateArea() method using the object
        ___;

        input.close();
    }
}
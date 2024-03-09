// Replace ___ with your code
import java.util.Scanner;

class Coordinate {

    // fields to store coordinates
    int x;
    int y;

    // constructor to initialize value of x and y
    // Hint: use this keyword
    Coordinate(int x, int y) {
        ___;
        ___;
    }
}

// Main class
class Main {

    // main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input values fo 4 coordinates
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        // create an object of Coordinate with arguments x1 and y1
        Coordinate c1 = ___;

        // create another object of Coordinate with arguments x2 and y2
        Coordinate c2 = ___;

        // subtract x coordinates of c1 and c2
        int xDiff = ___;

        // subtract y coordinate of c1 and c2
        int yDiff = ___;

        // print the result
        System.out.println(xDiff);
        System.out.println(yDiff);

        input.close();
    }
}
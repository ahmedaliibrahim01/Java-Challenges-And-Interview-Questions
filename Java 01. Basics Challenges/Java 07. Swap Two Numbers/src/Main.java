// Replace ___ with your code
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input values for x and y
        System.out.print("Enter Number x : ");
        int x = input.nextInt();
        System.out.print("Enter Number y : ");
        int y = input.nextInt();

        // temporary variable
        int temp;

        // swap two values using temp
        temp = x;
        x = y;
        y = temp;

        // print values after swapping
        System.out.println("X : " + x);
        System.out.println("Y : " + y);

        input.close();
    }
}
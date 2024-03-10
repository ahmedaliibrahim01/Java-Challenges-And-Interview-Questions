// Replace ___ with your code
import java.util.Scanner;

class Main {

    public static int calculatePower(int x, int n) {
        // base case
        // if n is 0, return 1
        ___ {
            ___
        }

        // recursive case
        // calculate x^n by recursively multiplying x by calculatePower(x, n-1)
        ___
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // take user input for x
        int x = input.nextInt();

        // take user input for n
        int n = input.nextInt();
        // call the calculatePower method with x and n, and store the result in a variable
        int result = calculatePower(x, n);

        // print the result of the power calculation
        System.out.println(result);
    }
}
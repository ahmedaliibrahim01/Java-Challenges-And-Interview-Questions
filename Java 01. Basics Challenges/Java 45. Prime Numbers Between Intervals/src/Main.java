// Replace ___ with your code
import java.util.Scanner;

class Main {

    // method to check prime number
    // return true if the number is prime, else return false
    // hint: Use the same logic from the previous challenge
    ___

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input value for two intervals
        int x = input.nextInt();
        int y = input.nextInt();

        Main obj = new Main();

        // run a loop to access each value in interval x and y
        for (int i = x; i <= y; ++i) {

            // call checkPrime for every value between x and y
            boolean result = ___;

            // if returned value is true, print the number
            ___
        }

        input.close();
    }
}
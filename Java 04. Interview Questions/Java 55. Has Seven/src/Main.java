// Replace ___ with your code
import java.util.Scanner;

class Main {
    public static boolean hasSeven(int number) {
        // loop through number as long as n is greater than 0
        ___ {
            // get the rightmost digit using modulus division
            ___
                    // check if the rightmost digit is equal to 7
                    // if so, return true
                    ___
            // discard the rightmost digit using '/'
            ___
        }
        // if we have traversed all the digits and none of them is 7, return false
        ___
    }

    public static void main(String[] args) {

        // take input from the user
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // call hasSeven() method
        System.out.println(hasSeven(number));

    }
}
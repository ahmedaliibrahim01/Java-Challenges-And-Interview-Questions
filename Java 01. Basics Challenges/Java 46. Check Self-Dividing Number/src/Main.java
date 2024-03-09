// Replace ___ with your code
import java.util.Scanner;

class Main {

    // method to check self dividing number
    boolean checkSelfDivide(int number) {
        int num = number;
        int digit;

        while (num != 0) {
            // access each digit of num
            // hint: use num % 10 to get the last digit
            digit = ___;

            // check if any digit doesn't divide the number
            // if it doesn't, return false
            ___

                    // remove the last digit of num
                    num = num / 10;

        }

        // if all digit divide number
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input value for number
        int number = input.nextInt();

        Main obj = new Main();

        // call checkSelfDivide() with the number argument
        boolean result = ___;

        // if result is true, print Self Dividing Number
        // otherwise, print Not a Self Dividing Number
        ___

        input.close();
    }
}
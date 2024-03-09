// Replace ___ with your code
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // get input value for number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int num = number;
        int digit;
        int sum = 0;

        // run while loop to access each digit of number
        while (num != 0) {

            // use num % 10 to find each digit of number
            ___

                    // add each digit to sum
                    ___

            // remove last digit from number
            num = num / 10;
        }

        // print the sum
        ___

        input.close();
    }
}
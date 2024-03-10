// Replace ___ with your code below
// import necessary package
import java.util.Scanner;

class Main {

    // function to check armstrong Number
    public static boolean isArmstrong(int number) {

        int sum = 0;

        // copy the number to temp
        int temp = ___

        // count number od digits in the input number
        int numberOfDigits = 0;

        while(temp != 0) {

            // increase the number of digit
            ___

                    // remove right most digit of temp
                    ___
        }

        // copy the number to temp
        temp = number;

        // check armstrong
        while(temp != 0) {

            // get rightmost digit of the number
            ___

                    // add the value of the digit raised to the power of the number of digits to the sum
                    ___

            // remove rightmost digit of the number
            ___

        }

        // retun true if the sum of the powers of the digits is equal to the number
        return (sum___number);

    }

    public static void main (String[] args) {

        // take input from the user
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // call is armstrong function
        if(isArmstrong(number)) {
            System.out.println("Armstrong");
        }
        else {
            System.out.println("Not Armstrong");
        }
    }
}
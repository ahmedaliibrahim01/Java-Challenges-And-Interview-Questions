// Replace ___ with your code
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // get input value for number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // assign the number to another variable originalNumber
        int originalNumber = number;

        // sum variable to store the sum of cubes
        int sum = 0;

        // variable to access each digit of number
        int remainder;

        // loop to find the cubes of each digit
        while (originalNumber != 0) {

            // use originalNumber % 10 to get the last digit
            remainder = ___;
            // add the cube of the last digit to sum
            sum = ___;

            // use originalNumber / 10 to change the value of originalNumber
            originalNumber = ___;
        }

        // check if sum is equal to number
        if (___) {
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not an Armstrong Number");
        }

        input.close();
    }
}
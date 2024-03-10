// Replace ___ with your code below
import java.util.Scanner;

class Main {

    // method to find the factorial of a number
    int findFactorial(int number) {

        // if the number is either 0 or 1, return 1 as the factorial
        ___ {
            ___
        }

        // variable to store the factorial
        int factorial = 1;

        // loop through the integers from number to 1
        ___ {

            // multiply each value with factorial
            ___
        }
        // retrun factorial
        ___
    }

    public static void main(String[] args) {

        // get input value for the number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // call the findFactorial() method
        Main obj = new Main();
        int result = obj.findFactorial(number);

        System.out.println(result);
    }
}
// Replace ___ with your code below
import java.util.Scanner;

class Main {
    // function to check if a number is prime
    public static boolean isNumberPrime(int number) {
        // run a loop from 2 to number - 1
        ___ {
            // check if i divides the number perfectly
            ___ {
                // the number is not prime
                return false;
            }
        }
        // the number is prime
        return true;
    }

    public static void main(String[] args) {
        // take a number input from user
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // check if number is less than or equal to 1
        if (number <= 1) {
            System.out.println("Not Prime");
            return;
        }

        // check if the number is prime
        boolean isPrime = isNumberPrime(number);

        // print result based on whether the number is prime or not
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
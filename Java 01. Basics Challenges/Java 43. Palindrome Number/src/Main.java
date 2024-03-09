// Replace ___ with your code
import java.util.Scanner;

class Main {

    // method to reverse a number
    // hint: solve the previous challenge to understand how to reverse a number
    ___

            // create checkPalindrome() method with two parameters: number and reversedNumber
            // check if two numbers are equal or not
            // print Palindrome Number, if they are equal.
            // otherwise, print Not a Palindrome Number
            ___

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input value for number
        int number = input.nextInt();

        Main obj = new Main();

        // call findReverse() to find reverse of number
        int reversedNumber = ___;

        // call checkPalindrome with arguments: number and reversedNumber
        // to check if number is palindrome
        obj.checkPalindrome(number, reversedNumber);

        input.close();
    }
}
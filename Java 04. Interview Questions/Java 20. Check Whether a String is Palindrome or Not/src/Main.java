// Replace ___ with your code below
import java.util.Scanner;

class Main {

    public static boolean isPalindrome(String str) {

        // use if statement to check if the string is empty or has only one character
        // in either case, return true
        if (___) {
            ___
        }

        // iterate over the first half of the characters in the string
        for (___) {

            // compare the character at the current index with the character
            // at the opposite index and if not equal return false
            if (___)) {

                // return false
                ___
            }
        }
        // if we reach here, all the characters matched
        // so the string is a palindrome
        ___
    }

    public static void main(String[] args) {

        // take input from the user
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        // call the isPalindrome() method and and pass the user's input as a parameter
        System.out.println(isPalindrome(str));
    }
}
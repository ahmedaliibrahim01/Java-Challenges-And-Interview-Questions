// Replace ___ with your code below
import java.util.Scanner;

class Main {

    // method to check if the text string is a palindrome
    public static boolean checkPalindrome(String text) {

        // replace all non-alphanumeric characters with empty string
        text = text.___("[^a-zA-Z0-9]", "");

        // convert the modified string to lowercase
        text = ___

        // get the length of the string
        int length = text.length();

        // check if the string is palindrome or not
        ___{
            // compare the character at the current index with
            // the character at the opposite index and if not equal return false
            ___
                    ___
        }
    }
        return ___
}

public static void main(String[] args) {

    // Read the text  from the user
    Scanner scanner = new Scanner(System.in);

    String text = scanner.nextLine();

    // check if the text sentence is a palindrome and store the result
    boolean isPalindrome = checkPalindrome(text);

    // print the result whether the text sentence is a palindrome or not
    System.out.println(isPalindrome);
}

}
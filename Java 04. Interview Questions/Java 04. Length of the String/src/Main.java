// Replace ___ with your code below
import java.util.Scanner;

class Main {

    // method to find the length of a String without using the length() method
    public static int lengthOfString(String text) {

        // convert the input String to a character array
        char[] textArray = ___

        // counter variable to count the number of characters
        int count = 0;

        // loop through each character of the String
        // increase the value of count for each iteration
        ___ (char ch : ___) {
            ___
        }

        return count;
    }

    public static void main(String[] args) {

        // get input String
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        // call the lengthOfString method and print the result
        System.out.println(lengthOfString(text));
    }
}
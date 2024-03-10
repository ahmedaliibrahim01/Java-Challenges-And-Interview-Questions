// Replace ___ with your code below
// import necessary libraries
___
import java.util.Scanner;
___

class Main {

    // define method to find unique characters in a string and return a list of unique characters
    public static List<___> findUniqueChars(String text) {

        // convert the string to a character array
        char chars[] = ___

        // create an array to hold count of each character (ASCII value range is 0-255)
        int[] count = new int[256];

        // iterate through the characters and increment count for each character
        for (___) {

            char c = chars[i];

            // increase the value of count for each character
            ___
        }

        // create a list to hold unique characters
        List<Character> uniqueCharsList = new ArrayList<>();

        // iterate over the array and add unique characters (count = 1) to the list
        for (___) {
            char c = chars[i];

            // check if character is unique (count = 1)
            ___ {
                // add it to uniqueCharsList
                ___
            }
        }

        // return the list of unique characters
        ___
    }

    // main method to take input and print the list of unique characters
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // take input string from user
        String text = input.nextLine();

        // call findUniqueChars method to get the list of unique characters in the input string
        List<Character> uniqueCharsList = findUniqueChars(text);

        // print the list of unique characters
        System.out.println(uniqueCharsList);
    }
}
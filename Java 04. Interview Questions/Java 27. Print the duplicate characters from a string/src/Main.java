// Replace ___ with your code
// import necessary classes from the Java standard library
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// Define the Main class
class Main {

    // method to find repeated characters
    public static List<Character> findRepeatedCharacter(String text) {

        // create a hashmap to store the characters and their  count
        HashMap<___> charCount = ___

        // loop through the text
        for(___) {

            char c = text.charAt(i);

            // if current character is already in the map, increment its count
            if(___) {
                ___.put(___, ___ + 1);
            }

            // else, add the character to the map with a count 1
            else {
                ___
            }
        }

        // create arraylist to store repeated characters
        List<Character> repeatedChars = new ArrayList<>();

        // loop through each key-value pair in the charCount map
        for(Map.Entry<Character, Integer> entry: charCount.entrySet()) {

            // check whether the value of the current key is greater than 1
            if(entry.getValue() ___) {
                // add key (repeated character) to the repeatedChars
                ___
            }
        }

        // return the repeated character
        ___

    }

    public static void main (String[] args) {
        // take input from the user
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        // call find character method
        List<Character> repeatedChars = findRepeatedCharacter(text);

        // print repeatedChars
        System.out.println(repeatedChars);
    }

}
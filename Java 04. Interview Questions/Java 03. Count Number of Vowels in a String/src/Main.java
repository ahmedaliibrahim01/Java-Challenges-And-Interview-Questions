// Replace ___ with your code below
import java.util.Scanner;

class Main {

    public static int countVowels(String text) {

        // convert the text string to lowercase
        String convertedString = text.toLowerCase();

        // initialize a counter variable
        int counter = 0;

        // loop through convertedString from the start of the string
        ___ {

            // use charAt() and check if letter at each index of convertedString
            // is either 'a', 'e', 'i', 'o', 'u'
            ___ {

                // increase the counter variable by 1
                ___
            }
        }
        // return the counter variable
        ___
    }

    public static void main(String[] args) {

        // get input string
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        // call countVowels method and print the result
        int result = countVowels(text);
        System.out.println(result);
    }

}
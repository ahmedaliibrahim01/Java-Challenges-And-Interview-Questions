// Replace ___ with your code
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // get input value for string
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        // use substring() to split the input string to two strings
        // first substring contains the first letter
        // hint: to access first letter, use indexes 0 and 1
        String firstLetter = ___;

        // second substring contains the remaining letters
        // hint: to use remaining letters, use indexes 1 and string.length()
        String remainingLetters = ___;

        // change the first letter to uppercase
        firstLetter = ___;

        // join the two substrings
        text = ___;
        System.out.println(text);

        input.close();
    }
}
// Replace ___ with your code
import java.util.Scanner;

class Main {

    public static String repeatSeparator(String word, String separator, int count) {
        //returns a string made of count occurrences of word, separated by separator
        ___
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // take input for the word
        String word = scanner.nextLine();

        // take input for the separator
        String separator = scanner.nextLine();


        // take input for the count
        int count = scanner.nextInt();

        // call repeatSeparator() and pass the user input as parameters
        System.out.println(repeatSeparator(word, separator, count));
    }
}
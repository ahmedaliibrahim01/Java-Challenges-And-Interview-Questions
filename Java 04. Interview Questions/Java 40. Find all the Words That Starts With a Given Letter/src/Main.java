// Replace ___ with your code
import java.util.Scanner;
import java.util.Arrays;

class Main {

    public static String[] findWordsStartingWithLetter(String text, char letter) {

        // find the words starting with given letter
        ___

        // resize the array to remove any null values
        return Arrays.copyOf(wordsStartingWithLetter, count);
    }

    public static void main(String[] args) {
        // take input from user
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        // given first letter
        char firstLetter = 'J';

        // call the findWordsStartingWithLetter method to find words starting with the given letter
        String[] wordsStartingWithLetter = findWordsStartingWithLetter(text, firstLetter);

        // print the words starting with the given letter
        for (String word : wordsStartingWithLetter) {
            System.out.println(word);
        }
    }
}
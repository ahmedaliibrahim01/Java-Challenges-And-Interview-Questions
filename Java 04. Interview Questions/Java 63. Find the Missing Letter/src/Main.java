// Replace ___ with your code
import java.util.Scanner;

class Main {
    public static char missingLetter(char[] letters) {
        // iterate through the letters array
        ___ {
            // if the difference between the current letter and the next letter is more than 1,
            // then the missing letter is the letter that comes immediately after the current letter
            ___
        }
        // if no missing letter is found, return '\0'
        return '\0';
    }

    public static void main(String[] args) {

        // take character input from the user
        Scanner scanner = new Scanner(System.in);
        char[] letters = new char[5];
        for (int i = 0; i < 5; i++) {
            letters[i] = scanner.next().charAt(0);
        }

        // call missingLetter() and pass the letters character array
        System.out.println(missingLetter(letters));

        // close the scanner object
        scanner.close();
    }
}
// replace ___ with your code
import java.util.Scanner;

class Main {

    public static int countNumbers(String text) {
        // initialize the counter variable to 0
        ___

                // iterate through the characters in the text string
                ___

        // use Character.isDigit() to find if the character is a digit,
        // if so, increase the counter variable by 1
        ___
    }

    // return the count of numbers
    ___
}

public static void main(String[] args) {

    // take input from the user
    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();

    // call the countNumbers method to count the numbers in the text
    int count = countNumbers(text);

    // print the result
    System.out.println(count);

    scanner.close();
}

}
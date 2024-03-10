// Replace ___ with your code below
import java.util.Scanner;
class Main {

    static void numberOfDigits(int number, int digit) {

        // convert number to a string using Integer.toString()
        String stringBeforeReplacement = ___

        // convert digit to a string using Integer.toString()
        String digitConvertedToString = Integer.toString(digit);

        // replace all occurrences of digitConvertedToString
        // with an empty string using replaceAll()
        String stringAfterReplacement = ___

        // calculate the difference in string length before and after replacement
        int count = s___

        // print count
        System.out.println(count);
    }

    public static void main(String[] args) {

        // take int input
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        //digit we want to count
        int digit = 5;

        numberOfDigits(number, 5);

    }
}
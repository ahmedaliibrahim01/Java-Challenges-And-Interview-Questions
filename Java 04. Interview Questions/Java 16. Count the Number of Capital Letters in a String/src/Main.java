// Replace ___ with your code below
import java.util.Scanner;

class Main {

    public static int countCapitalLetters(String text) {
        // convert the text string to character array using the toCharArray() method
        char[] characterArray = text.toCharArray();

        // initialize counter variable named count to zero
        int count = 0;

        // use for loop to loop through each element of characterArray
        ___ {

            //use isUpperCase() to check if character is in uppercase
            ___ {
                count++;
            }
        }

        // return count
        return ___
    }

    public static void main(String[] args) {

        // take input for the text string
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        // call countCapitalLetters method
        // to count the number of capital letters in the given string
        int count = countCapitalLetters(text);

        // print count
        System.out.println(count);
    }
}
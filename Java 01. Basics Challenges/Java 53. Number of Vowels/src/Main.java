// Replace ___ with your code
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // get input value for string
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        // convert the string input to lowercase for simplicity
        // hint: use toLowerCase() method
        text = ___;

        // variable to count the number of vowels
        int vowels = 0;

        // run a for loop to access each character of a string
        // hint: run loop from 0 to string.length() - 1
        for (int i = 0; ___; ++i) {

            // access each character using charAt()
            char x = ___;

            // check if each character is vowel of not
            // hint: compare x with all vowel characters using ||
            if (___) {
                // increase the value of vowels by 1
                ___
            }
        }

        System.out.println(vowels);
        input.close();
    }
}
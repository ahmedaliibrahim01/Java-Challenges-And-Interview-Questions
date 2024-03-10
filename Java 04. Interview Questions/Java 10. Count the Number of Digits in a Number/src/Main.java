// Replace ___ with your code below
import java.util.Scanner;

class Main {

    public static int countDigits(int number) {

        // convert number to a string using Integer.toString() method
        String stringNumber = ___

        // use length() to get the length of the string
        int numberOfDigits = ___


        // return numberOfDigits
        return ___
    }

    public static void main(String[] args) {

        // take integer input
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // get the number of digits using countDigits() method
        int numberOfDigits = countDigits(number);

        // print the numberOfDigits
        System.out.println(numberOfDigits);
    }
}
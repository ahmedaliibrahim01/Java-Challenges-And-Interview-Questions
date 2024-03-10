// Replace ___ with your code
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static boolean consecutiveNumbers(int[] arr) {
        // returns true if the array consists of consecutive numbers
        ___
    }

    public static void main(String[] args) {

        // take input from the user
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println(consecutiveNumbers(numbers));
    }
}
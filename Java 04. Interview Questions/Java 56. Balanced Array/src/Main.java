// Replace ___ with your code
import java.util.Scanner;

class Main {
    public static boolean canBalance(int[] nums) {

        // return true if array can split into two part and sum of both parts are same
        ___
    }

    public static void main(String[] args) {
        // create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // create an array to store the elements
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // call canBalance() and pass numbers
        System.out.println(canBalance(numbers));
    }
}
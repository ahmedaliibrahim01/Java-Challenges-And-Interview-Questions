// Replace ___ with your code
import java.util.Scanner;

class Main {

    public static int calculateMaxProduct(int[] numbers) {

        // calculate maximum product of two elements in an array
        ___
    }

    public static void main(String[] args) {
        // take array input
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            // read input from user
            numbers[i] = scanner.nextInt();
        }

        // call the calculateMaxProduct method
        int maximumProduct = calculateMaxProduct(numbers);

        // print the maximum product of two elements in the array
        System.out.println(maximumProduct);
    }
}
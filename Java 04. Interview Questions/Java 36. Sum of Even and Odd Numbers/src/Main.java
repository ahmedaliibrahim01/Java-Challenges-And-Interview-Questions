// Replace ___ with your code
import java.util.Scanner;

class Main {

    public static int[] calculateSums(int[] numbers) {

        // initialize the sumOdd and sumEven variables to 0
        ___
                ___

        // iterate through the array and calculate the sums
        for (int number : numbers) {
            // for each number in the array, check if it is odd or even
            // if even, add it to sumEven else add it to sunOdd
            ___
        }

        // return the sums as an array
        ___
    }

    public static void main(String[] args) {

        // take array input
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // call the calculateSums method and pass the numbers array
        int[] sums = calculateSums(numbers);

        // print the results
        System.out.println(sums[0]);
        System.out.println(sums[1]);
    }
}
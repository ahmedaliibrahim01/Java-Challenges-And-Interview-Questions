// Replace ___ with your code
import java.util.Scanner;

class Main {

    public static int sumOfLargestAndSmallest(int[] numbers) {
        // initialize variables to keep track of the largest and smallest numbers
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        // loop through the array to find the largest and smallest numbers
        ___ {
            // check if current element of array is greater than current value of largest variable
            ___ {

                // update largest variable with current element
                ___
            }
            // check if current element of array is smaller than current value of smallest variable
            ___ {

                //update smallest variable with current element
                ___
            }
        }

        // return the sum of the largest and smallest numbers
        ___
    }

    public static void main(String[] args) {
        // create scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // take input for the array
        int[] numbers = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // call sumOfLargestAndSmallest method
        // find the sum of largest and smallest numbers in the array
        int sum = sumOfLargestAndSmallest(numbers);

        // print the sum of largest and smallest numbers in the array
        System.out.println(sum);
    }
}
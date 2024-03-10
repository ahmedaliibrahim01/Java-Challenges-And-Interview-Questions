// Replace ___ with your code below
import java.util.Scanner;

class Main {

    public static int findMin(int[] numbers) {
        // assign a variable to store first element of the numbers array
        int min = numbers[0];

        // iterate through each element of the array
        ___ {

            // check if the current element is less than min
            ___

                    // replace the value of min
                    ___
        }

        // return the smallest element
        return min;
    }

    public static void main(String[] args) {
        // create object of Scanner
        Scanner input = new Scanner(System.in);

        // define size of the array
        int[] numbers = new int[6];

        // take input values for the array
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        // call the findMin function to get the smallest element
        int min = findMin(numbers);

        // print min
        System.out.println(min);
    }
}
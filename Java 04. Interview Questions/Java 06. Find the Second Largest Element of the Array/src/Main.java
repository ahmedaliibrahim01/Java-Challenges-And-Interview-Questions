// Replace ___ with your code below
import java.util.Scanner;

class Main {

    // method to find the second largest element
    // takes an integer array as input
    int findSecondLargest(___) {

        // variables to track the largest and second largest elements
        int largest, secondLargest;

        // initialize largest and second largest elements
        // with first and second elements making the comparison
        if (___) {
            ___
        }
        else {
            ___
        }

        // run a loop from the third element
        for (int i = 2; i < numbers.length; ++i) {

            // compare the element with largest and second largest
            // if the element is greater than largest,
            // assign largest to secondLargest and element to largest
            if (___) {
                ___
                        ___
            }
            // if element is greater than secondLargest but smaller than largest
            // assign the element to secondLargest
            else if (___) {
                ___
            }
        }

        // return the second largest element
        return secondLargest;
    }

    public static void main(String[] args) {

        // define an array
        int[] numbers = int int[5];

        // get input values for array
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numbers.length; ++i) {
            numbers[i] = input.nextInt();
        }

        // call the method by passing array as the input
        Main obj = new Main();
        int secondLargest = obj.findSecondLargest(numbers);

        // print the second largest element
        System.out.println(secondLargest);
    }
}
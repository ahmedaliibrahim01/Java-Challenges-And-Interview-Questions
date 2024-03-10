// Replace ___ with your code below
import java.util.Scanner;

class Main {

    // method to find the missing number in the given array
    public static int findMissingNumber(int[] numbers) {
        // initialize a variable to store the sum of the current array
        int sumOfCurrentArray = 0;
        // loop through the array and add each element to the sumOfCurrentArray variable
        ___ {
            sumOfCurrentArray ___
        }

        // calculate the sum of natural numbers from 1 to n
        int n = numbers.length + 1;
        int sumOfSequence =___

        // calculate the missing number by subtracting the sum of the current array from the sum of the sequence
        int missingNumber = ___

        // return the missing number
        ___
    }

    public static void main(String[] args) {

        // create an integer array
        int[] numbers = new int[8];

        // take input from the user
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // call the findMissingNumber method and print the result
        int missingNumber = findMissingNumber(numbers);
        System.out.println(missingNumber);
    }

}
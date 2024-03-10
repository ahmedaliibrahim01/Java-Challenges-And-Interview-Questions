// Replace ___ with your code below
import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static int[] reverseArray(int[] originalArray) {
        // create a new empty array with the same length as the original array
        int[] reversedArray = new int[originalArray.length];

        // initialize a counter variable to 0
        int j = 0;

        // iterate over the originalArray array in reverse order
        ___ {
            // add the element at the current index to the corresponding position in
            // reversedArray
            ___
                    // increment the counter variable
                    ___
        }

        // return the reversed array
        ___
    }

    public static void main(String[] args) {
        // take input for the array
        Scanner scanner = new Scanner(System.in);
        int[] originalArray = new int[5];

        for (int i = 0; i < originalArray.length; i++) {
            originalArray[i] = scanner.nextInt();
        }

        // call the method to reverse the array
        int[] reversedArray = reverseArray(originalArray);

        // print out the reversed array
        System.out.println(Arrays.toString(reversedArray));
    }
}
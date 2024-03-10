// Replace ___ with your code below
import java.util.Scanner;

class Main {

    // method to find the first and last occurrences of an element in an array
    public static int[] findOccurrences(int[] array, int element) {

        // store index of first occurrence
        int firstOccurrence = -1;

        // store index of first occurrence
        int lastOccurrence = -1;

        // iterate over the array to find the first occurrence of the element
        ___

                // iterate over the array in reverse to find the last occurrence of the element
                ___

        // return an array containing the first and last occurrences of the element
        return new int[] {firstOccurrence, lastOccurrence};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // get input from the user
        int[] array = new int[6];

        // populate the array with user input
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        // element to search for
        int element = 5;

        // find the first and last occurrences of the element
        int[] occurrences = findOccurrences(array, element);

        // print the first and last occurrences of the element
        if (occurrences[0] != -1) {
            System.out.println(occurrences[0]);
            System.out.println(occurrences[1]);
        }
    }
}
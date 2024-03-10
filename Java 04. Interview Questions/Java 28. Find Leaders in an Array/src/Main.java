// replace ___ with your code below
import java.util.Scanner;
import java.util.Arrays;

class Main {

    public static int[] findLeaders(int[] numbers) {
        // create an array to store leaders
        int[] leaders = new int[numbers.length];

        // initialize index to 0
        int index = ___

        // initialize max to the rightmost element of the numbers array
        int max = ___

        // add max to the leaders array
        leaders[index] = max;
        index++;

        // loop through the numbers array starting from the second last element
        for (___) {
            // if current element is greater than max,
            if (___) {
                // update max to be the current element
                ___
                        // add it to the leaders array
                        ___
                index++;
            }
        }

        // resize the leaders array to remove any unused space
        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = leaders[i];
        }

        return result;
    }

    public static void main(String[] args) {

        // take user input for array elements
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // call the function to find leaders in the array
        int[] leaders = findLeaders(numbers);

        // print the leaders array as string
        System.out.print(Arrays.toString(leaders));
    }
}
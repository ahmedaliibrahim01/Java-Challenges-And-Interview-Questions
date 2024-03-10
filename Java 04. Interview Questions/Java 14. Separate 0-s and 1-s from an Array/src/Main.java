// Replace ___ with your code below
import java.util.Arrays;
import java.util.Scanner;

class Main {

    // method to separate zeros and ones in an array
    public static int[] separateZerosOnes(int[] array) {
        int count = 0;

        // count the number of zeros in the array
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count++;
            }
        }

        // calculate the number of ones in the array
        int onesCount = ___

        // create a new array to store the output
        int[] output = new int[array.length];

        // fill the first count positions in the new array with 0s
        ___ {
            ___
        }

        // fill the remaining positions in the new array with 1s
        ___ {
            ___
        }

        // return the new array
        ___
    }

    public static void main(String[] args) {

        // take input for the array
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[6];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        // call the method to separate zeros and ones in the array
        int[] output = separateZerosOnes(array);

        // print output array
        System.out.println(Arrays.toString(output));
    }
}
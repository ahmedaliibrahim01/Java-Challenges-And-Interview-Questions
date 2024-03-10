// Replace ___ with your code
import java.util.Scanner;
import java.util.Arrays;

class Main {

    public static boolean luckySeven(int [] array) {

        // return true if sum of any 3 elements equals 7
        ___
    }

    public static void main(String[] args) {

        // take input from the user
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        boolean result = luckySeven(arr);
        // print the result
        System.out.println(result);
    }
}
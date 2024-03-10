// Replace ___ with your code
import java.util.ArrayList;
import java.util.Scanner;

class Main {

    public static void separateEvenOdd(int[] numbers) {
        // create two Integer ArrayLists named evenNumbers and oddNumbers
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        ArrayList<Integer> oddNumbers = new ArrayList<Integer>();

        // loop through each element of the numbers array
        for (int item : numbers) {
            // use if-else statement to check whether number is even or odd
            // and add that number to respective ArrayLists
            ___ {
                ___
            } else {
                ___
            }
        }

        // print output the even and odd numbers
        System.out.println(evenNumbers);
        System.out.println(oddNumbers);
    }

    public static void main(String[] args) {

        // take input for the array
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[6];

        // loop to fill the array with user input
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // call separateEvenOdd method to separate even and odd numbers in the array
        separateEvenOdd(numbers);
    }
}
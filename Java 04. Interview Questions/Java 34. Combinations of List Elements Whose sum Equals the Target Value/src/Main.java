// replace ___ with your code below
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {

    public static int[] findSum(int[] numbers, int target) {
        // create a temporary list to store the numbers that have been scanned
        List<Integer> temp = new ArrayList<>();

        // loop through each element in the original array
        for (int num : ___) {
            // if the difference between the target number and the current element is in the
            // temporary list, return both elements
            ___ {
                ___
            }
            // add the current element to the temporary list
            ___
        }

        // if no two numbers in the array add up to the target value, return -1 and -1
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ask the user to input the elements of the array
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // set target value
        int target = 9;

        // call the findSum method with the array and the target value of 9
        int[] result = findSum(numbers, target);

        // print result
        System.out.println(result[0] + " and " + result[1]);
    }
}
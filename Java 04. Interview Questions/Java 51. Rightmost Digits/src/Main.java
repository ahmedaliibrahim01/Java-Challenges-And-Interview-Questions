// Replace ___ with your code
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static List<Integer> storeRightDigit(List<Integer> numbers) {
        // return a new list containing the rightmost digits of the input list
        ___
    }

    public static void main(String[] args) {
        // create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // create an empty list to store the input integers
        List<Integer> list1 = new ArrayList<>();

        // take input for the three items in the list
        for (int i = 1; i <= 3; i++) {
            int item = scanner.nextInt();
            list1.add(item);
        }

        // call storeRightDigit() and pass list1
        System.out.println(storeRightDigit(list1));
    }
}
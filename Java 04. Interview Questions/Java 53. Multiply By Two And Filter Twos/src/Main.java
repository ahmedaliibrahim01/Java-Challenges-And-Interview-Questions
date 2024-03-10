// Replace ___ with your code
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static List<Integer> multiplyByTwoAndFilterTwos(List<Integer> numbers) {
        // return a List of integers containing the input numbers multiplied by 2 and
        // remove any resulting numbers that end in 2
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

        // call multiplyByTwoAndFilterTwos() and pass list1
        System.out.println(multiplyByTwoAndFilterTwos(list1));
    }
}
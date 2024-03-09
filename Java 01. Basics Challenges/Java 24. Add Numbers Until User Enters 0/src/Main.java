// Replace ___ with your code

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int sum = 0;

        // run a while loop that breaks only if input value is 0
        // take input value for number inside the loop
        // if input value is other than 0, add the value to sum
        while (sum >= 0) {
            number = input.nextInt();
            if (number == 0) {
                break;
            }
            sum += number;
        }

        // print the sum
        System.out.println(sum);

        input.close();
    }
}
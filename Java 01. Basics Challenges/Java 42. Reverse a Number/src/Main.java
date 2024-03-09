// Replace ___ with your code
import java.util.Scanner;

class Main {

    // method to reverse a number
    int findReverse(int number) {
        int reversed = 0;
        int remainder;

        // run a while loop until number is equal to 0
        // inside the loop, find the reverse of number
        // hint: use logic number % 10 to find the last digit
        // add last digit to reversed using logic: reversed * 10 + last digit
        ___

        return reversed;
    }

    public static void main(String[] args) {

        // get input value for number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        Main obj = new Main();

        // call findReverse() with argument, number
        int result = ___;
        System.out.println(result);

        input.close();
    }
}
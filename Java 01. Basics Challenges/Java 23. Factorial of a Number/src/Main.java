// Replace ___ with your code
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input value for number
        System.out.print("Enter Number : ");
        int number = input.nextInt();

        int factorial = 1;

        // run a for loop from i = 1 to i <= number
        // inside the loop multiply factorial with i
        for(int i = 1; i <= number; i++){
            factorial = factorial * i;
        }

        // print factorial
        System.out.println("Factorial Number is : " + factorial);

        input.close();
    }
}
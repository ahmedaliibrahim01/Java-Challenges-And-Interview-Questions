// Replace ___ with your code
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input value for operator
        String op = input.next();

        // get input value for first and second
        double first = input.nextDouble();
        double second = input.nextDouble();

        switch (op) {
            // perform operations based on the value of op
            // hint: follow this format
            // case "+":
            //     System.out.println(first + second);
            //     break;

            // use cases:
            // case "+": for addition
            // case "-": for subtraction
            // case "*": for multiplication
            // case "/": for division
            ___

            // if op doesn't match with any cases
            default:
                System.out.println("Invalid Operator");
        }

        input.close();
    }
}
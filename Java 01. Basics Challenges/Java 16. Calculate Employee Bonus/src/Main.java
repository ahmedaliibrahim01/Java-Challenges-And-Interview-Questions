// Replace ___ with your code
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input values for salary and year of service
        System.out.print("Enter Salary : ");
        double salary = input.nextDouble();
        System.out.print("Enter Service Year : ");
        double serviceYear = input.nextDouble();

        // check if serviceYear is greater than 5
        if (serviceYear > 5) {

            // compute the bonus and print it
            double bonus = (5 * salary)/100;
            // hint: 5% bonus is equal to (5 * salary) / 100
            System.out.println("Bonus : " + bonus);
        }

        input.close();
    }
}
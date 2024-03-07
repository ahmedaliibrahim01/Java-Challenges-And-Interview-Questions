// Replace ___ with your code
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input values for principal, time, rate
        System.out.print("Enter Principal : ");
        double principal = input.nextDouble();
        System.out.print("Enter Time : ");
        double time = input.nextDouble();
        System.out.print("Enter Rate : ");
        double rate = input.nextDouble();

        // compute simple interest
        double simpleInterest = (principal * time * rate) / 100;

        // compute final amount
        double finalAmount = principal + simpleInterest;

        // print simple interest and final amount in separate lines
        System.out.println("Simple Interest : " + simpleInterest);
        System.out.println("Final Amount : "+finalAmount);

        input.close();
    }
}
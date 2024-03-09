// Replace ___ with your code
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input value for pound
        System.out.print("Enter Pound : ");
        double pound = input.nextDouble();

        // convert pound to kg and print value in kg
        double kg = pound * 0.453592;
        System.out.println("KG : " + kg);

        input.close();
    }
}
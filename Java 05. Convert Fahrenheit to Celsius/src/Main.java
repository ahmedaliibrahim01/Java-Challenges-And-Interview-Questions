import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // take fahrenheit temperature input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Fahrenheit : ");
        double fahrenheit = input.nextDouble();

        // convert fahrenheit temperature to celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // print temperature in celsius
        System.out.println("Celsius : " + celsius);

        input.close();
    }
}
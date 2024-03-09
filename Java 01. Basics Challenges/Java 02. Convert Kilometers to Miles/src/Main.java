import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // take input for km
        System.out.print("Enter km : ");
        double km = input.nextDouble();

        // convert km to miles
        double miles = km / 1.6;

        // display value in miles
        System.out.println("Miles : " + miles);

        input.close();
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // take input for length and breadth
        System.out.print("Enter length : ");
        int length = input.nextInt();
        System.out.print("Enter breadth : ");
        int breadth = input.nextInt();

        // calculate area of rectangle
        int area = length * breadth;
        System.out.println("Area : " + area);

        input.close();
    }
}
// Replace ___ with your code
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input values for chocolate and children
        System.out.print("Enter Number of Chocolate : ");
        int chocolate = input.nextInt();
        System.out.print("Enter Number of Children : ");
        int children = input.nextInt();

        // find the number of chocolate each child gets
        // hint: use / operator
        int eachChild = chocolate/children;

        // find the remaining chocolates
        // hint: use % operator
        int remaining = chocolate%children;

        // print the result values
        System.out.println("Each Child : " + eachChild);
        System.out.println("Remaining : " + remaining);

        input.close();
    }
}
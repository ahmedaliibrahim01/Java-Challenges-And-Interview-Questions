import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // take integer input for the length
        System.out.print("Enter Length : ");
        int length = input.nextInt();

        // compute the volume and print it
        int volume = length * length * length;
        System.out.println("Volume : " + volume);;

        input.close();
    }
}
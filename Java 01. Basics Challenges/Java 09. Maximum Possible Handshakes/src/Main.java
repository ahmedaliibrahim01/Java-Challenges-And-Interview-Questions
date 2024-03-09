// Replace ___ with your code
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input value for students
        System.out.print("Enter Students : ");
        int students = input.nextInt();

        // find the possible handshakes and print it
        int combination = (students * (students - 1)) / 2;
        System.out.println("Combination : " + combination);

        input.close();
    }
}
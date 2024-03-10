// Replace ___ with your code below
import java.util.Scanner;

class Main {

    public static boolean isValidEmail(String email) {

        // check if the email matches the regular expression
        if (!___)) {
            return false;
        }

        return ___
    }

    public static void main (String[] args) {

        // take email input
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        // check if email is valid
        if(isValidEmail(email)) {
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
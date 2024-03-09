// Replace ___ with your code
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        // get input values for jack, roman and johnny
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Jack Age : ");
        int jack = input.nextInt();
        System.out.print("Enter Roman Age : ");
        int roman = input.nextInt();
        System.out.print("Enter Johnny Age : ");
        int johnny = input.nextInt();

        // use if else to find the youngest brother
        if((jack < roman) && (jack < johnny)){
            System.out.println("Youngest brother is : Jack");
        }else if((roman < jack) && (roman < johnny)){
            System.out.println("Youngest brother is : Roman");
        }else{
            System.out.println("Youngest brother is : Johnny");
        }

        input.close();
    }
}
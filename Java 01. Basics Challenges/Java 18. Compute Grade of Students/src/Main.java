// Replace ___ with your code
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // get input value for marks
        System.out.print("Enter Marks : ");
        Scanner input = new Scanner(System.in);
        double marks = input.nextDouble();

        // check the value of marks and assign grade based on the value
        if(marks >= 90){
            System.out.println("A");
        }else if(marks >= 80){
            System.out.println("B");
        }else if(marks >= 70){
            System.out.println("C");
        }else{
            System.out.println("D");
        }

        input.close();
    }
}
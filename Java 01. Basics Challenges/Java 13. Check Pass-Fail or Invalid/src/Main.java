// Replace ___ with your code
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input value for marks
        System.out.print("Enter Marks : ");
        int marks = input.nextInt();

        // check if user has entered valid marks or not
        // also check if the student passed or failed
        // hint: use if...else if ladder
        if(marks < 0 || marks > 100){
            System.out.println("Invalid Marks");
        }else if(marks > 40){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

        input.close();
    }
}
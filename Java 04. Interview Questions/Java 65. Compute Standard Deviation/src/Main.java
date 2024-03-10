// Replace ___ with your code
import java.util.Scanner;

class Main {

    double calculateSD(double data[]) {

        // compute standard deviation of data[]
        ___

    }

    public static void main(String[] args) {

        // array to store numbers
        double[] numbers = new double[5];

        // get input for numbers
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < numbers.length; ++i) {
            numbers[i] = input.nextDouble();
        }

        // call the calculateSD() method with the numbers array as argument
        Main obj = new Main();
        double sd = obj.calculateSD(numbers);

        System.out.println(sd);

        input.close();
    }
}
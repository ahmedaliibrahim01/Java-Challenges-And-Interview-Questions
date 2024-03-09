// Replace ___ with your code
import java.util.Scanner;

class Main {

    // method to compute standard deviation
    double calculateSD(double data[]) {
        double sum = 0.0;

        // find the sum of all the array elements
        for (int i = 0; i < data.length; ++i) {
            sum = ___;
        }

        // compute the mean
        double mean = ___;

        double result = 0.0;
        for (int i = 0; i < data.length; ++i) {

            // find the difference of each array value and mean
            double difference = ___;

            // compute the square of each difference
            double squaredDifference = ___;

            // add all the square difference
            result = ___;
        }

        // compute the variance by dividing the above result by data.length
        ___

                // compute the standard deviation by computing the square root of variance
                ___

        // return standard deviation
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
        double sd = ___;

        System.out.println(sd);

        input.close();
    }
}
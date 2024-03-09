// Replace ___ with your code
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // array to store height
        double[] heights = new double[11];

        // get input for heights
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < heights.length; ++i) {
            heights[i] = input.nextDouble();
        }

        double sum = 0.0;

        // find the sum of all the heights
        ___

        // find the mean height and print it
        double mean = ___;
        System.out.println(mean);

        input.close();
    }
}
// Replace ___ with your code
import java.util.Scanner;

class Temperature {

    // fields to store temperatures
    int hot;
    int cold;

    // constructor to initialize value of hot and cold
    Temperature(int hot, int cold) {
        ___;
        ___;
    }

    // method to check IcyHot temperature
    void checkIcyHot() {

        // check if hot is greater than 100 and cold is less than 0,
        // if true print IcyHot
        if (___) {
            System.out.println("IcyHot");
        }
    }
}

// Main class
class Main {

    // main() method
    public static void main(String[] args) {

        // get input values for hot and cold temperature
        Scanner input = new Scanner(System.in);
        int hot = input.nextInt();
        int cold = input.nextInt();

        // create an object of Temperature with arguments hot and cold
        Temperature t1 = ___;

        // call checkIcyHot() using the object
        ___;

        input.close();
    }
}
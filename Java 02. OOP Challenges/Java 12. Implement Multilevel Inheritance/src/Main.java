// Replace ___ with your code
import java.util.Scanner;

class Animal {
    void eat() {
        System.out.println("I eat animal food.");
    }
}

// inherit the Mammal class from Animal
// create display() method to print I am a mammal.
___

// inherit the Dog class from Mammal
class Dog ___ {

    // get the name parameter and print the name
    void displayName(___) {
        System.out.println("My name is " + name + ".");
    }
}

class Main {
    public static void main(String[] args) {

        // get input value for the name
        Scanner input = new Scanner(System.in);
        String name = input.next();

        // create an object of Dog
        Dog labrador = new Dog();

        // call the displayName() method with the name argument
        ___

                // call display() and eat() method of Mammal and Animal
                ___
        ___

        input.close();
    }
}
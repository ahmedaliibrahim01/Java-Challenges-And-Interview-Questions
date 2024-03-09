// Replace ___ with your code
// create an enum of type Size
___ Size {

// add enum constants
___

// create a method
public String getSize() {

    // this refers to current object
    switch (this) {

        case SMALL:
            ___

        case MEDIUM:
            ___

        case LARGE:
            ___

        case EXTRA_LARGE:
            return "extra large";

        default:
            return "nothing";
    }
}
}

class Main {
    public static void main(String[] args) {

        // print "Your card is: " + Size.MEDIUM.getSize()
        System.out.println("Your card is: " + ___.MEDIUM.___);
    }
}
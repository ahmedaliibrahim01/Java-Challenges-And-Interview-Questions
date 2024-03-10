// replace ___ with your code below
class Main {
    public static void main(String[] args) {
        // given string
        String name = "abc";

        // initialize a counter variable named counter to 0
        ___

        while (name.length() > 0) {
            // check if the string is a palindrome
            if (___) {
                // if it is, break the loop.
                ___
            }
            // if the string is not a palindrome, delete the last character and increase the
            // counter by 1
            name = name.substring(___);
            counter++;
        }

        // print the counter variable
        System.out.println("Minimum number of characters to add: " + ___);
    }

    public static boolean isPalindrome(String s) {
        // iterate over the string up to the middle character
        for (int i = 0; i < s.length() / 2; i++) {
            // if the current character and its corresponding character on the other side of
            // the string do not match, the string is not a palindrome.
            if (___) {
                return false;
            }
        }
        // if the loop completes without finding any non-matching characters, the string
        // is a palindrome
        return true;
    }
}
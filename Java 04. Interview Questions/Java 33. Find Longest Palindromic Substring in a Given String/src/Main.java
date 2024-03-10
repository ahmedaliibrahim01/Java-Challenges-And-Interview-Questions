// Replace ___ with your code below
import java.util.Scanner;
class Main
{
    // expand around the center of the center
    // return palindromic String

    public static String expandFromMiddle(String text, int begin, int end) {

        // expand text till we reach the start or end of the string
        // and character at both indices are equal
        while (___) {

            // move index of begin one step backwards
            ___

                    // move index of end one step forwards
                    ___
        }
        return text.substring(begin+1, end);
    }

    // find longest palindromic String
    public static String findLongestPalindrome(String text) {

        // check if string is null or has one or less charcter
        if(___) {

            // return text
            ___
        }

        // intialize longest variable to the first character of the string
        String longest = text.substring(0,1);

        // loop through each character of string
        for(___) {

            // call expand method as current string as center of the palindrome
            String temp = ___

            // update longest to the longest palindromic String
            if(temp.length() > longest.length()) {
                ___
            }

            // call expand method with current character and next character as center of substring
            temp = ___

            // update longest to the longest palindromic String
            if(temp.length() > longest.length()) {
                ___
            }

        }
        // return longest palindromic substring
        ___
    }

    public static void main(String[] args) {

        // take input from the user
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        // find the longest palindrome of the string
        String longestPalindrome =findLongestPalindrome(text);

        // print the String
        System.out.println(longestPalindrome);

    }
}
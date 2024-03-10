// Replace ___ with your code below
import java.util.Scanner;

class Main {
    public static void permute(String str, int l, int r) {
        // base case: if l and r are the same, the string has been fully permuted
        // print the permuted string
        ___ {
            ___
        } else {
            // recursive case: swap each character with the first character and recurse
            for (___) {
                // swap character at index l with character at index i
                str =___
                // recursively call permute with l incremented by 1
                permute___
            }
        }
    }

    // method to swap two characters in a string
    public static String swap(String str, int i, int j) {

        char[] chars = str.toCharArray();
        // store the character at index i in a temporary variable
        char temp = chars[i];
        // swap the characters at indices i and j
        chars[i] = chars[j];
        chars[j] = temp;
        // return the modified string
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        // get input from user
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        // find the length of the string
        int n = str.length();
        // call permute function with l and r as the first and last indices of the
        // string
        permute(str, 0, n - 1);
    }
}
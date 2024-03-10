// Replace ___ with your code
import java.util.HashMap;
import java.util.Scanner;

class Main {

    public static HashMap<String, Integer> countWords(String text) {

        // split the text into array of words
        String words[] = ___

        // create a HashMap named wordCount to store the wordcount
        HashMap<String, Integer> wordCount = new HashMap<>();

        // use for each loop to iterate over array of words
        for(String word: ___) {

            // check if the word is already in the HashMap
            // use containsKey() method
            ___ {

                // update the word count by 1
                wordCount.put(___, wordCount.get(word) + ___);
            }
            else {
                // add it to wordCount with count 1
                ___
            }
        }
        return wordCount;

    }
    public static void main (String[] args) {

        // take input from the user
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        // call the countWords() funciton
        HashMap<String, Integer> wordCount = countWords(text);

        // print word count
        System.out.println(wordCount);
    }
}
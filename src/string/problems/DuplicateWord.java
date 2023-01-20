package string.problems;

import java.util.Arrays;
import java.util.HashMap;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        HashMap<String, Integer> occurrences = new HashMap<>();
        occurrences = CountWords(st);
        System.out.println(occurrences);
    }

    // a java program to find the duplicate words and their number of occurrences in the string

    public static HashMap<String, Integer> CountWords(String st) {
        HashMap<String, Integer> mapOfOccurrences = new HashMap<>();

        String updatedData = st.replace(".", "");
        String[] words = updatedData.split(" ");
        Arrays.sort(words);

        int i, j;

        for (i = 0; i < words.length - 1; i++) {
            int count = 1;
            for (j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    count++;
                } else break;
            }
            if (count > 1) {
                mapOfOccurrences.put(words[i], +count);
                i += (count - 1);
            }

        }


        return mapOfOccurrences;
    }
   // Find the average length of the words.

    public void average(){

    }

}




package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {

    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement
        //
        int i;
       String splitS[] = s.split(" ");

       int max = splitS[splitS.length-1].length();

       String word = null;
       for(i=0; i<splitS.length;i++){
           if(splitS[i].length()>max){
               max = splitS[i].length();
               word=splitS[i];
           }
       }
        System.out.println(max+", "+word);
       wordNLength=findTheLargestWord("Human brain is a biological learning machine");
       System.out.println(wordNLength);

    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = wordGiven;
        //implement
        String arrayofs[] = st.split(" ");
        int max = arrayofs[arrayofs.length-1].length();
        int i;
        String word = null;
        for(i=0; i<arrayofs.length;i++){
            if(arrayofs[i].length()>max){
                max = arrayofs[i].length();
                word=arrayofs[i];
            }
        }
        map.put(max,word);


        return map;
    }
}

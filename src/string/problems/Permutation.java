package string.problems;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Permutation {
    /*
     * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
     * Write Java program to compute all Permutation of a String
     *
     */

    public static void main(String[] args) {
        // Create An Object Of Scanner Class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String data = scanner.nextLine();
        System.out.println("permutation of " + data + ": \n" + getPermutation(data));
    }

    public static Set<String> getPermutation( String word){
        // create A Set To Avoid Duplicate Permutation
        Set<String> permutations = new HashSet<String>();
        // Check If String Is Null
        if (word == null){
            return null;
        }else if(word.length() == 0) {
            permutations.add("");
            return permutations;
        }
        // Get The First Character
        char first = word.charAt(0);
        // Get The Remaining Substring
        String sub = word.substring(1);
        // Make Recursive call to getPermutation
        Set<String> words = getPermutation(sub);
        // Access Each Element From Words
        for ( String wordNew : words) {
            for (int i = 0; i <= wordNew.length(); i++) {
                // insert the permutation tp the set
                permutations.add(wordNew.substring(0, i) + first + wordNew.substring(i));
            }
        }
        return permutations;
            }

    }


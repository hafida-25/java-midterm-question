package string.problems;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first word ");
        String word1 = scanner.nextLine();
        System.out.println("please enter your second word");
        String word2 = scanner.nextLine();
        if (word1.length() != word2.length()) {
            System.out.println("the words are not anagram");
        } else {
            char[] charArrayOfWord1 = word1.toCharArray();
            char[] charArrayOfWord2 = word2.toCharArray();
            Arrays.sort(charArrayOfWord1);
            Arrays.sort(charArrayOfWord2);
            if (Arrays.equals(charArrayOfWord1, charArrayOfWord2)) {
                System.out.println("the words are anagram");
            } else {
                System.out.println("the two words are not anagram");
            }
        }
    }

        }




        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".





package string.problems;

import java.util.Scanner;

public class Palindrome {

     /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String : ");
        String string = scanner.nextLine();
        if (palindrome(string)) {
            System.out.println(string + " is a palindrome");
        } else {
            System.out.println(string + " is not palindrome");
        }
    }


    public static boolean palindrome(String s){
        if (s.length() == 0 || s.length() == 1)
            return true;
        if(s.charAt(0) ==  s.charAt(s.length()-1))
            return palindrome(s.substring(1, s.length()-1));
        return false;

    }


    }


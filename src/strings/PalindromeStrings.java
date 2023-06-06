package src.strings;

import java.util.Scanner;

public class PalindromeStrings {


    public static void main(String[] args) {

        String s;
        System.out.println("Enter the String....");
        try (Scanner sc = new Scanner(System.in)) {
            s = sc.nextLine();
        }
        // CONVERTING IT TO LOWER CASE AND THEN PASSING IT TO THE FUNCTION
        // APPROACH 1
        System.out.println("**********************APPROACH 1 START*************************");
        boolean isPalindrome = palindromeCheck(s.toLowerCase());
        if(isPalindrome){
            System.out.println( s + " is a Palindrome String");
        }else{
            System.out.println(s + " is not a Palindrome String");
        }


        System.out.println("*******************************END*****************************");

        System.out.println("**********************APPROACH 2 START*************************");

        // APPROACH 2
        boolean palindrome = palindromeCheckUsingStringBuilder(s.toLowerCase());
        if(palindrome){
            System.out.println( s + " is a Palindrome String");
        }else{
            System.out.println(s + " is not a Palindrome String");
        }

        System.out.println("*******************************END*****************************");

    }


    // APPROACH 1
    public static boolean palindromeCheck(String str){
        boolean isPalindrome = true;

        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    // APPROACH 2
    public static boolean palindromeCheckUsingStringBuilder(String str){
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();
        return str.contentEquals(builder);
    }



}

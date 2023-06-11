package src.strings;

import java.util.Scanner;

public class ReverseAllWordsOfAString {

    /*
    * Reverse all words of a String
    * Input :- davood ahmad bhat
    * Output :- doovad damha tahb
    * */
    public static void main(String[] args) {

        String s;
        System.out.println("Enter the String to be reversed....");
        try(Scanner sc = new Scanner(System.in)){
             s = sc.nextLine();
        }

        System.out.println("Reversed String : "+ reverseString(s));


    }


    public static String reverseString(String str){
        String[] words = str.split(" ");
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < words.length; i++){
            StringBuilder stringBuilder = new StringBuilder();
            for(int j = words[i].length() - 1; j >= 0; j--){
                char ch = words[i].charAt(j);
                stringBuilder.append(ch);
            }
            builder.append(stringBuilder).append(" ");
        }

        return builder.toString();
    }
}

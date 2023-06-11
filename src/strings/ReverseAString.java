package src.strings;

import java.util.Scanner;

public class ReverseAString {

    /*
    * Q:- Reverse A String in Java
    * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String that needs to be reversed");
        String s = sc.nextLine();
        System.out.println("Actual String : " + s);
        reverseString(s);

    }

    public static void reverseString(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--){
            char c = str.charAt(i);
            sb.append(c);
        }

        System.out.println("Reversed String : "+ sb.toString());
    }

}

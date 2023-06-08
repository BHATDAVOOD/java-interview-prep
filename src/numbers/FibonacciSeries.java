package src.numbers;

import java.util.Scanner;

public class FibonacciSeries {

    /*
    * Fibonacci Series :- 0 1 1 2 3 5 8........
    * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count for which fibonacci series has to be generated....");
        int totalNumbers = sc.nextInt();
        fibonacci(totalNumbers);

    }

    public static void fibonacci(int n){

        // First number of fibonacci series is 0 and Second is 1
        int num1 = 0 , num2 = 1;
        int num3;
        int totalNumbers = 0;

        while(totalNumbers < n){
            System.out.print(num1 + " ");
            num3 = num2 + num1;
            num1 = num2;
            num2 = num3;

            totalNumbers ++;
        }
    }


}

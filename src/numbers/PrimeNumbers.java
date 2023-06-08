package src.numbers;

import java.util.Scanner;

public class PrimeNumbers {

    /*
    * Print Prime numbers from 1 to n
    * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number up to which prime numbers are to be generated....");
        int n = sc.nextInt();
//
//        boolean value = isPrime(n);
//        if(value){
//            System.out.println(n + " is a Prime Number");
//        }else {
//            System.out.println(n + " is not a Prime Number");
//        }

        for(int i = 1; i <=n; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }


    }

    public static boolean isPrime(int n){
        if(n < 2){
            return false;
        }

        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }



}

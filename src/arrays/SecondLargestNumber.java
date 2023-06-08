package src.arrays;

import java.util.Arrays;

public class SecondLargestNumber {

    /*
    * Find SecondLargest Number in An Array
    * Example :-
    * Input :- {1,2,55,66,23,88,88,74,4,6}
    * Output :- 74
    * */

    public static void main(String[] args) {

        int[] arr = {1,2,55,66,23,88,88,74,4,6};
        secondLargest(arr);
    }


    public static void secondLargest(int[] arr){

        // arr= {1,2,55,66,23,88,88,74,4,6}
        int size = arr.length;
        if(size < 2){
            System.out.println("Array has only one element");
        }

        Arrays.sort(arr);  // {1,2,4,6,23,55,66,74,88,88}

        for(int i = size - 2; i >= 0; i--){
            if (arr[i] != arr[size-1]){
                System.out.println("Second Largest number is : "+arr[i]);
                return;
            }
        }
        System.out.println("No Second Largest number found");
    }
}

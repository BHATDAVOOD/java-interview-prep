package src.arrays;

import java.util.Arrays;

public class SecondSmallestNumber {

    /*
     * Find Second Smallest Number in An Array
     * Example :-
     * Input :- {55,66,23,88,88,1,1,2,74,4,6}
     * Output :- 2
     * */

    public static void main(String[] args) {
        int[] arr = {55,66,23,88,88,1,1,2,74,4,6};
        //int[] arr1 = {1,1,1,1};
        //int[] arr2 = {1};
        secondSmallest(arr);
    }

    public static void secondSmallest(int[] arr){
        int size = arr.length;
        if(size < 2){
            System.out.println("Array has only 1 element");
            return;
        }
        Arrays.sort(arr);

        for(int i = 1; i < size; i++){
            if(arr[i] != arr[0]){
                System.out.println("Second Smallest Number is : "+arr[i]);
                return;
            }
        }
        System.out.println("Array has no second smallest number");
    }
}

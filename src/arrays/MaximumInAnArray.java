package src.arrays;

public class MaximumInAnArray {

    public static void main(String[] args) {

        int[] numbers = {1,2,34,7,9,5};
        System.out.println("Maximum Value : " + maximumInArray(numbers));
    }


    public static int maximumInArray(int[] arr){

        int max = arr[0];
        for(int i =1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }

}

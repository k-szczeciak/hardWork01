import java.util.ArrayList;
import java.util.List;

public class main02 {

    public static void main(String[] args) {

        int[] input = {11,21,53,4,15,12,17,9};
        System.out.println("smallest number: " + findMin(input));
        System.out.println("second smallest number: " + findSecondSmallest(input));
        System.out.println("n-th smallest number: " + findNthSmallest(input, 2));


    }

    //finding smallest number in array
    public static int findMin(int[] arr){
        //finding min, 0-th smallest element in table
        int result = arr[0];
        int pos = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < result ){
                result = arr[i];
                pos = i;
                System.out.println("position of smallest number: " + pos);
            }
        }
        return result;
    }

    // int[] input = {11,21,53,4,5,12,7,9};
    // second: finding second smallest number in array
    public static int findSecondSmallest(int[] arr){
        int smallest = arr[0];
        int secondSmallest = smallest;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest){
                smallest = arr[i];
            }
            if (arr[i] < secondSmallest && arr[i] > smallest){
               secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }

    // int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    // int[] input = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    // third task finding n-th smallest number
    public static int findNthSmallest(int[] arr, int nth){
        int[] resultArr = new int[arr.length];
        int result = arr[0];
        resultArr[0] = arr[0];
        for (int i = 0; i < arr.length; i++) {
            resultArr[i] = arr[i];
        }
        int n_max = 0;
        for (int i = 1; i < arr.length; i++) {

            if (nth < i){n_max = nth;}else{n_max = i;}
            for (int j = 0; j < n_max; j++) {
                if (arr[i] < resultArr[j]) {
                    if (i > 1) {
                        resultArr[j+1] = resultArr[j];
                    }
                    resultArr[j] = arr[i];
                } else {
                    if (arr[i] < resultArr[j+1]) {
                        resultArr[j+1] = arr[i];
                    }
                }
            }
        }
        result = resultArr[nth];
        return result;
    }


    //public int result;
}

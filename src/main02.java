public class main02 {

    public static void main(String[] args) {

        int[] input = {11,21,53,4,15,12,17,9};
        System.out.println("smallest number: " + findMin(input));
        System.out.println("second smallest number: " + findSecondSmallest(input));


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

    //int[] input = {11,21,53,4,5,12,7,9};
    //finding second smallest number in array
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


    //public int result;
}

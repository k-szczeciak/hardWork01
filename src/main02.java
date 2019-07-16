public class main02 {

    public static void main(String[] args) {
        System.out.println("test");

        int[] input = {1,2,3,0,5,6,7,9};
        System.out.println(findMin(input));


    }

    public static int findMin(int[] arr){
        //finding max
        int result = arr[0];
        int pos = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < result ){
                result = arr[i];
                pos = i;
                //new results
            }
        }
        return result;
    }

    public int result;
}

package sample;

public class FindPeakInMountainArray {

    private final static int[] input = {2,4,5,7,5,4,3};

    public static void main(String[] args) {

        int start = 1;
        int end = input.length-2;
        int ans = 0;
        while(start <=end){
            int mid = start + (end -start)/2;
            System.out.println("mid" + mid);

            if(input[mid]> input[mid-1] && input[mid] > input[mid+1]){
               ans = input[mid];
               break;
            }else if( input[mid] < input[mid+1]){
                start = mid+1;
            }else{
                end = mid -1;
            }
        }

        System.out.println (ans);


    }
}

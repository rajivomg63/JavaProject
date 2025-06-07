package sample;

public class SquareOfSortedArray {

    private static int[] input = {-8,-2,4,6,9};

    public static void main(String[] args) {

        int i=0;
        int j = input.length-1;
        int k =j;
        int[] output = new int[input.length];

        while(i<=j){
            if(Math.abs(input[i])>Math.abs(input[j])){
                int ans = input[i]*input[i];
                output[k] = ans;
                i++;
                k--;
            }else{
                int ans = input[j]*input[j];
                output[k] = ans;
                j--;
                k--;
            }
        }

        for( i =0;i< output.length;i++) {
            System.out.println("output" + output[i]);
        }

    }
}

package sample;

public class MountainArray {

    private final static int[] input = {2,4,5,7,5,4,3};

    public static void main(String[] args) {
        int i = 0;
        while( i+1 < input.length && input[i+1] > input[i]){
            i++;
        }

        int j = input.length-1;
        while( i-1 > 0 && input[j-1] > input[j]){
            j--;
        }

        System.out.println (i==j && i>0 && j < input.length-1);


    }
}

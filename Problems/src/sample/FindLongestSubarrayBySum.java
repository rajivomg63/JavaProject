package sample;

public class FindLongestSubarrayBySum {

    private final static int[] input = {1, 2, 3, 4, 5, 0, 0, 0, 6, 7, 8, 9, 10};

    private final static int targetSum = 15;

    public static void main(String[] args) {

        int sum = input[0];
        int left = 0;
        int output[] = new int[2];

        for (int right = 1; right < input.length; right++) {
          // System.out.println("sum "+ sum);
            sum += input[right];
            if ((sum  == targetSum)) {
              //  System.out.println("left "+ left + " right"+right);
                if ((output[1] - output[0])< (right - left)) {
                    output[0] = left;
                    output[1] = right;
                }

            }
            if ((sum ) > targetSum) {
                sum = sum - input[left];
                left++;
            }



        }

        for(int i=0;i<output.length;i++){
            System.out.println(output[i]);
        }
    }
}

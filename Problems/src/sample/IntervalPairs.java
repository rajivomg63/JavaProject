package sample;

import java.util.*;

public class IntervalPairs {

    public static void main(String[] args) {
        int[] nums = {15,10,11,7,25,12,8,9,1,3,4,5,6};

         Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }

         List<List<Integer>> outputList = new ArrayList<>();
            int start  = nums[0]; int end = nums[0];

            for(int i=1;i<nums.length;i++){
                if(nums[i-1]+1 == nums[i]){
                   end = nums[i];
                }
                else{
                    List<Integer> pair = new ArrayList<>();
                    pair.add(start);
                    pair.add(end);
                    outputList.add(pair);
                    start= nums[i];
                    end = nums[i];
                }
            }
            System.out.println("Outside for loop" + start + " " + end);
            List<Integer> lastPair = new ArrayList<>();
            lastPair.add(start);
            lastPair.add(end);
            outputList.add(lastPair);

            //print outputList
        for(List<Integer> pair : outputList){
            System.out.println(pair);
        }




        int[][] output = {{1,1},{3,6},{8,12}};



    }

}

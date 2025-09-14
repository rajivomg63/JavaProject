package sample;

import java.util.HashSet;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(set.contains(target - nums[i]) ){
                System.out.println("Found the pair: " + nums[i] + ", " + (target - nums[i]));
            }else{
                set.add(nums[i]);
            }
        }
    }
}

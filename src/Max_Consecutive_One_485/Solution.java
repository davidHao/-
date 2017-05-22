package Max_Consecutive_One_485;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int currentLength = 0;
        for(int i=0; i < nums.length; i++){
           if(nums[i] == 1) currentLength++;
           else currentLength=0;
           
           max = Math.max(currentLength,max);
        }
        return max;
    }
}
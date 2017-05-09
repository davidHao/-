package arrayPairSum;

import java.util.Arrays;

public class ArrayPairSum {
    public int arrayPairSum(int[] nums) {
       Arrays.sort(nums);
       int ret = 0 ;
       for(int i=0; i<nums.length; i++){
           if(i%2 == 0 ){
               ret = ret + nums[i];
           }
       }
       return ret;
    }
}
// 用hashMap把每一个数值都找设置成一个key，通过hashmap的get， containskey 方法找出两个和为target的数值
// 题目link: https://leetcode.com/problems/two-sum/#/description

package twoSum;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        HashMap<Integer, Integer> hashMap= new HashMap<>();
        for( int i= 0; i< nums.length; i++) {
            if(hashMap.containsKey(target - nums[i])){
                ret[0]= hashMap.get(target- nums[i]);
                ret[1] = i;
                break;
            }
           hashMap.put(nums[i],i);
        }
        return ret;
    }
}
// 题目链接： https://leetcode.com/problems/array-partition-i/#/description
// leetcode 561. Array Partition I, 一个数组，含有2n个item（偶数个），两两一组（一共N组），把每一组的最小值拿出来求和，找出最大的和
// 思路： sort这个数组，单数相加就是最大的和
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
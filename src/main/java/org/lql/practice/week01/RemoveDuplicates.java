package org.lql.practice.week01;

import java.util.Arrays;

/**
 * @author: lql
 * @date: 2022/1/3 16:24
 * @description: 26. 删除有序数组中的重复项 https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 ||nums[i] != nums[i -1]) {
                nums[n++] = nums[i];
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(Arrays.toString(nums));
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int duplicates = removeDuplicates.removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(duplicates);
    }
}

package easy;

import java.util.*;

/**
 * problem-link: https://leetcode.com/problems/two-sum/
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] sum = new int[2];
        Map<Integer, Integer> res = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remain = target - nums[i];
            int n1 = res.getOrDefault(remain, -1);
            if (n1 != -1) {
                sum[0] = n1;
                sum[1] = i;
                break;
            } else {
                res.put(nums[i], i);
            }
        }
        return sum;
    }
}

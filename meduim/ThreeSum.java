package meduim;

import java.util.*;

/*
problem: https://leetcode.com/problems/3sum/description/
help:https://www.youtube.com/watch?v=jzZsG8n2R9A
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (i > 0 && val == nums[i - 1]) {
                continue;
            }
            if (val > 0) {
                break;
            }
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {

                int threeSum = val + nums[l] + nums[r];
                if (threeSum == 0) {
                    res.add(Arrays.asList(new Integer[] { val, nums[l], nums[r] }));
                    l++;
                    while (nums[l] == nums[l - 1] && l < r) {
                        l++;
                    }
                    // r--;
                } else if (threeSum < 0) {
                    l++;
                } else {
                    r--;
                }
            }

        }
        return res;
    }
}

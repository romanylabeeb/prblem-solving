package easy;

/**
 * https://leetcode.com/problems/climbing-stairs/
 */
public class ClimbStairs {
    public int climbStairs(int n) {
        if (n < 3) {
            return n;
        }
        int prev = 1;
        int prev2 = 2;
        for (int i = 3; i <= n; i++) {
            int current = prev2 + prev;
            prev = prev2;
            prev2 = current;
        }
        return prev2;

    }
}

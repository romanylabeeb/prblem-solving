package meduim;

/*
problem: https://leetcode.com/problems/minimum-suffix-flips/description/
 */
public class MinimumSuffixFlips {
    public int minFlips(String target) {
        int total = 0;
        char prev = '0';
        for (char c : target.toCharArray()) {
            if (c != prev) {
                total++;
                prev = c;
            }
        }
        return total;
    }
}

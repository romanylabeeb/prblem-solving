package meduim;

import java.util.*;

/**
 * https://leetcode.com/problems/longest-string-chain/description/
 */
public class LongestStrChain {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        Map<String, Integer> dp = new HashMap<>();
        int res = 0;
        for (String word : words) {
            int best = 0;
            for (int i = 0; i < word.length(); i++) {
                // get full word without current char
                String prev = word.substring(0, i) + word.substring(i + 1);
                best = Math.max(best, dp.getOrDefault(prev, 0) + 1);

            }
            dp.put(word, best);
            res = Math.max(res, best);
        }
        return res;
    }
}

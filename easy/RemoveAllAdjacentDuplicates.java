package easy;

import java.util.*;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/
 */
public class RemoveAllAdjacentDuplicates {
    public String removeDuplicates(String s) {
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stk.isEmpty() || c != stk.peek()) {
                stk.push(c);
            } else {
                stk.pop();
            }
        }
        return stk.stream().map(a -> a.toString()).collect(Collectors.joining(""));
    }
}

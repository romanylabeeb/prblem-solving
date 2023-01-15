import java.util.Arrays;

/*
https://leetcode.com/problems/longest-common-prefix/description/
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String f=strs[0];
        String last=strs[strs.length-1];
        int lastLen=last.length()-1;
        String count="";
        for(int i=0;i<f.length();i++){
            char c1=f.charAt(i);
            if(lastLen>=i&& last.charAt(i)==c1){
                count+=c1;
            }
            else{
                break;
            }
        }
        return count;
    }
}

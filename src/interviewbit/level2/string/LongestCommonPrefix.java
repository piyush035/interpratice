package interviewbit.level2.string;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("abcdefgh");
        list.add("abcefgh");
        list.add("abc");
        System.out.println("Palindrome :: " + new LongestCommonPrefix().longestCommonPrefix(list));
    }
    public String longestCommonPrefix(List<String> A) {
        if(null == A || A.isEmpty()){
            return "";
        }
        String lcp = A.get(0);
        for (String str:A) {
            if(lcp.length() < str.length()){
                lcp = str;
            }
        }
        for (String str: A) {
            int lenghtStr = str.length(), lengthLcp = lcp.length();
            StringBuilder newLCP = new StringBuilder();
            for(int i=0;i< lenghtStr && i<lengthLcp;i++){
                if(str.charAt(i) == lcp.charAt(i)){
                    newLCP.append(lcp.charAt(i));
                }else {
                    break;
                }
            }
            lcp = newLCP.toString();
        }
        return lcp;
    }
}

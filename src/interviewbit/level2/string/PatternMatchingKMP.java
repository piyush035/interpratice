package interviewbit.level2.string;

/**
 * This brute force algo to match the pattern in a string and to find the starting position.
 */
public class PatternMatchingKMP {
    public static void main(String[] args) {
        System.out.println("PatternMatching :: " + new PatternMatchingKMP().indexOfSubString("ABABDABACDABABCABAB", "ABABCABAB"));
    }

    /**
     * Using KMP
     *
     * @param str
     * @param pattern
     * @return
     */
    public int indexOfSubString(String str, String pattern) {
        char[] charStr = str.toCharArray();
        char[] pat = pattern.toCharArray();
        int postion = -1;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0, l = i; j < pattern.length(); j++, l++) {
                if (charStr[l] != pat[j]) {
                    postion = -1;
                    break;
                }
                postion = i + 1;
            }
            if (postion >= 0) {
                break;
            }
        }
        return postion;
    }

    private void createLPSArray(String pattern) {
        int len = 0, i = 1,size=pattern.length();
        int[] lps = new int[size];
        while(i<size){
            if(pattern.charAt(i) == pattern.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
        }

    }
}

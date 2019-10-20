package interviewbit.level2.string;

/**
 * This KMP algo to match the pattern in a string and to find the starting position.
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
        int[] lps = createLPSArray(pattern);
        int i = 0, j = 0;
        while (i < str.length()) {
            if (pattern.charAt(j) == str.charAt(i)) {
                j++;
                i++;
            }
            if (j == pattern.length()) {
                return j;
            } else if (i < str.length() && pattern.charAt(j) != str.charAt(i)) {
                if (j != 0)
                    j = lps[j - 1];
                else
                    i = i + 1;
            }
        }
        return -1;
    }

    private int[] createLPSArray(String pattern) {
        int len = 0, i = 1, size = pattern.length();
        int[] lps = new int[size];
        lps[0]=0;
        while (i < size) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = len;
                    i++;
                }
            }
        }
        return lps;
    }
}

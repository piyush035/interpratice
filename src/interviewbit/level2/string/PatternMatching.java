package interviewbit.level2.string;

/**
 * This brute force algo to match the pattern in a string and to find the starting position.
 */
public class PatternMatching {
    public static void main(String[] args) {
        System.out.println("PatternMatching :: " + new PatternMatching().indexOfSubString("ABABDABACDABABCABAB", "ABABCABAB"));
    }

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
}

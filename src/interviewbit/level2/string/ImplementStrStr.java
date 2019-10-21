package interviewbit.level2.string;

public class ImplementStrStr {
    public static void main(String[] args) {
        System.out.println("ImplementStrStr :: " + new ImplementStrStr().strStr("aabasd", "asd"));
    }

    public int strStr(final String A, final String B) {
        char[] charA = A.toCharArray();
        char[] charB = B.toCharArray();
        for (int i = 0; i < charA.length - charB.length + 1; i++) {
            int j = 0, l = i;
            while (j < charB.length) {
                if (charA[l] != charB[j]) {
                    break;
                }
                l++;
                j++;
            }
            if (j == charB.length) {
                return i;
            }
        }
        return -1;
    }
}

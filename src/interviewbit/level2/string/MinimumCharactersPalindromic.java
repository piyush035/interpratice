package interviewbit.level2.string;

public class MinimumCharactersPalindromic {
    public static void main(String[] args) {
        System.out.println("MinimumCharactersPalindromic :: " + new MinimumCharactersPalindromic().solve("AACFGFECA"));
    }

    public int solve(String A) {
        int end = A.length() - 1, count = 0;
        for (int i = 0; i <= end; i++) {
            if (!isPalindrome(A, 0, end - count)) {
                count++;
            }
        }
        return count;
    }

    boolean isPalindrome(String A, int start, int end) {
        while (start <= end) {
            if (A.charAt(start) != A.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

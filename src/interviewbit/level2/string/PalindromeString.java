package interviewbit.level2.string;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println("Palindrome :: " + new PalindromeString().isPalindrome("A man, a plan, a canal: Panama"));
    }

    public int isPalindrome(String A) {
        String str = A.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for (int i = 0; i < (str.length() / 2); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return 0;
            }
        }
        return 1;
    }
}

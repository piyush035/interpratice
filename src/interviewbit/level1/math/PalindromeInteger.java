package interviewbit.level1.math;

public class PalindromeInteger {
    public static void main(String[] args) {
        System.out.println("Result ::" + new PalindromeInteger().isPalindrome(12121));
    }

    public int isPalindrome(int A) {
        int temp = 0, i = 1, j=A;
        if(A <0){
            return 0;
        }
        if(A == 0){
            return 1;
        }
        StringBuilder sb = new StringBuilder();
        while (j > 0) {
            sb.append(j % 10);
            j /= 10;
        }
        String s = new String(""+A);
        return s.equalsIgnoreCase(sb.toString()) ? 1 : 0;
    }
}

package interviewbit.math;

public class ExcelColumnNumber {
    public static void main(String[] args) {
        System.out.println("Result ::" + new ExcelColumnNumber().titleToNumber("ABC"));
    }
    public int titleToNumber(String A) {
        int result = 0;
        char[] chars = A.toCharArray();
        for (int i=0; i<chars.length;i++){
            result = result*26 + (chars[i]-'A'+1);
        }
        return result;
    }
}

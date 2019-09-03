package interviewbit.math;

public class TrailingZerosinFactorial {
    public static void main(String[] args) {
        System.out.println("Result ::" + new TrailingZerosinFactorial().trailingZeroes(99));
    }

    public int trailingZeroes(int A) {
        int result = 0;
        for(int i=5; A/i > 0 ; i *= 5){
            result += A/i;
        }
        return result;
    }
}

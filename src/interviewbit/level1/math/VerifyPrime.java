package interviewbit.level1.math;

public class VerifyPrime {
    public static void main(String[] args) {
        System.out.println("Result ::" + new VerifyPrime().isPrime(7));
    }

    public int isPrime(int A) {
        if (A <= 1) {
            return 0;
        }
        for (int i = 2; i <= Math.sqrt(A); i++) {
            if (A % i == 0)
                return 0;
        }
        return 1;
    }
}

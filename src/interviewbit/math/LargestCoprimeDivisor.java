package interviewbit.math;

public class LargestCoprimeDivisor {

    public static void main(String[] args) {
        System.out.println("Result ::" + new LargestCoprimeDivisor().cpFact(2,3));
    }

    public int cpFact(int A, int B) {
        int gcd = gcd(A,B);
        while (gcd != 1) {
            A = A / gcd;
            gcd = gcd(A,B);
        }
        return A;
    }

    private static int gcd(int A, int B) {
        while(B !=0){
            int rem = A%B;
            A = B;
            B = rem;

        }
        return A;
    }
}

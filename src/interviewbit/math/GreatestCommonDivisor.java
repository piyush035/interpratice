package interviewbit.math;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println("Result ::" + new GreatestCommonDivisor().gcd(6, 9));
    }

    /*public int gcd(int A, int B) {
        int result = 0;
        if (A < 0 || B < 0)
            return result;
        if (A == 0 && B != 0)
            return B;
        if (B == 0 && A != 0)
            return A;
        if (B == A)
            return A;
        int min = A < B ? A : B;
        for (int i = 1; i <= min ; i++) {
            if ((A % i == 0 && B % i == 0) && i > result) {
                result = i;
            }
        }
        return result;
    }*/

    public int gcd(int A, int B)
    {
        while(B!=0)
        {
            int r=A%B;
            A=B;
            B=r;
        }
        return A;
    }
}

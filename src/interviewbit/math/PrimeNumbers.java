package interviewbit.math;

import java.util.ArrayList;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Result ::" + new PrimeNumbers().sieve(7));
    }

    public ArrayList<Integer> sieve(int A) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(A <= 1 ){
            return list;
        }
        for(int i=2; i<=A;i++){
            if(isPrime(i)){
                list.add(i);
            }
        }
        return list;
    }

    private static boolean isPrime(int A){
        for(int i=2;i<=Math.sqrt(A);i++){
            if(A%i==0)
                return false;
        }
        return true;
    }
}

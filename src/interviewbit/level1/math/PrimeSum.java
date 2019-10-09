package interviewbit.level1.math;

import java.util.ArrayList;

public class PrimeSum {
    private static boolean isPrime(int A) {
        for (int i = 2; i <= Math.sqrt(A); i++) {
            if (A % i == 0)
                return false;
        }
        return true;
    }
   /* private static ArrayList<Integer> getPrimes(int A) {
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
    }*/

    public static void main(String[] args) {
        System.out.println("Result ::" + new PrimeSum().primesum(10));
    }

    public ArrayList<Integer> primesum(int A) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (A == 0 || A % 2 != 0) {
            return list;
        }
        //ArrayList<Integer> primes = getPrimes(A/2+1);
        for (int i = 2; i <= A; i++) {
            if (isPrime(i) && isPrime(A - i)) {
                list.add(i);
                list.add(A - i);
                return list;
            }
        }
        //Map<Integer,Boolean> map = new HashMap<>();
        /*for (int prime: primes) {
            //map.put(prime,isPrime(A-prime));
            if(isPrime(A-prime) && list.isEmpty()){
                list.add(prime);
                list.add(A-prime);
                break;
            }
        }*/
        /*int size = primes.size();
        for(int i=0; i<size;i++){
            int temp = primes.get(i);
            for(int k=size-1; k >=0 && temp+primes.get(k)>= A ; k--){
                if(temp+primes.get(k) == A && list.isEmpty()){
                    list.add(temp);
                    list.add(primes.get(k));
                    break;
                }
            }
        }*/
        return list;
    }
}

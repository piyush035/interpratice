package interviewbit.math;

import java.util.List;

public class HammingDistance {
    public static void main(String[] args) {
        //System.out.println("Result ::" + new HammingDistance().hammingDistance(5));
    }
    public int hammingDistance(final List<Integer> A) {
        long ans=0;
        long size=A.size();
        int mod = 1000000007;
        for(long i=0;i<31;i++) {
            long count=0;

            for(int j=0;j<size;j++) {
                if(((long)A.get(j) & (long)(1<<i)) > 0) {
                    count++;
                }
            }

            ans = (ans + count * (size-count))%mod;

        }
        return (int) (ans << 1)%mod;
    }
}

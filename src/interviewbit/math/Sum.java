package interviewbit.math;

import java.util.ArrayList;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Result ::" + new Sum().squareSum(2));
    }

    public ArrayList<ArrayList<Integer>> squareSum(int A) {

        final ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        if (A <= 1) {
            return ans;
        }
        for (int a = 1; a * a <= A / 2; a++) {
            for (int b = 1; b * b <= A - a * a; b++) {
                if (a * a + b * b == A) {
                    ArrayList<Integer> newEntry = new ArrayList<Integer>();
                    newEntry.add(a);
                    newEntry.add(b);
                    ans.add(newEntry);
                }
            }
        }
        return ans;
    }
}

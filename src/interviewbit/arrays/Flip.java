package interviewbit.arrays;

import java.util.ArrayList;

public class Flip {
    public static void main(String[] args) {
        System.out.println("Result ::" + new Flip().flip("010"));
    }

    public ArrayList<Integer> flip(String A) {
        ArrayList ans = new ArrayList<>();
        int max = 0;
        int s_min = 0;
        int e_min = 0;
        int sum = 0;
        int s = 0, e = 0;
        for (int i = 0; i < A.length(); i++) {
            e = i;
            if (A.charAt(i) == '0') {
                sum += 1;
            } else {
                sum -= 1;
            }
            if (sum < 0) {
                sum = 0;
                s = i + 1;
            }
            if (max < sum) {
                max = sum;
                s_min = s;
                e_min = e;
            }
        }
        if (max != 0) {
            ans.add(s_min + 1);
            ans.add(e_min + 1);
        }
        return ans;
    }
}


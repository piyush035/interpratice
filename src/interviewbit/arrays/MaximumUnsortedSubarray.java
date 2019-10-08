package interviewbit.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumUnsortedSubarray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);//"", "0.234601", "2.126313", "1.372403", "2.022170", "0.308558", "2.120754", "1.561462"
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Integer[] inte = new Integer[]{1, 1, 10, 10, 15, 10, 15, 10, 10, 15, 10, 15};
        System.out.println("Result ::" + new MaximumUnsortedSubarray().subUnsort(Arrays.asList(inte)));
    }

    public ArrayList<Integer> subUnsort(List<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int s = 0, e = A.size() - 1, i, max, min;
        // step 1(a) of above algo
        for (s = 0; s < A.size() - 1; s++) {
            if (A.get(s) > A.get(s + 1))
                break;
        }
        if (s == A.size() - 1) {
            ans.add(-1);
            return ans;
        }

        // step 1(b) of above algo
        for (e = A.size() - 1; e > 0; e--) {
            if (A.get(e) < A.get(e - 1))
                break;
        }

        // step 2(a) of above algo
        max = A.get(s);
        min = A.get(s);
        for (i = s + 1; i <= e; i++) {
            if (A.get(i) > max)
                max = A.get(i);
            if (A.get(i) < min)
                min = A.get(i);
        }

        // step 2(b) of above algo
        for (i = 0; i < s; i++) {
            if (A.get(i) > min) {
                s = i;
                break;
            }
        }

        // step 2(c) of above algo
        for (i = A.size() - 1; i >= e + 1; i--) {
            if (A.get(i) < max) {
                e = i;
                break;
            }
        }

        ans.add(s);
        ans.add(e);
        return ans;
    }

    public ArrayList<Integer> subUnsort1(List<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        List<Integer> list1 = new ArrayList<>();
        for (int i : A) {
            list1.add(i);
        }
        Collections.sort(list1);
        int left = -1, right = -1;
        for (int i = 1; i < A.size(); i++) {
            if (A.get(i) != list1.get(i)) {
                left = i;
            }
        }
        for (int i = A.size() - 1; i >= 0; --i) {
            if (A.get(i) != list1.get(i)) {
                right = i;
            }
        }
        if (left == -1) {
            ans.add(-1);
            return ans;

        }
        ans.add(left);
        ans.add(right);
        return ans;
    }
}

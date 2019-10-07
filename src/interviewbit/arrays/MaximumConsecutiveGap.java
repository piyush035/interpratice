package interviewbit.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumConsecutiveGap {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(10);
        list.add(5);
        //list.add(4);
        System.out.println("Matrix :: " + new MaximumConsecutiveGap().maximumGap(list));
    }

    public int maximumGap(final List<Integer> A) {
        int result = 0;
        int[] indexedArr = new int[A.size()];
        if (null == A || A.isEmpty() || A.size() < 2) {
            return result;
        }
        for (int i = 0; i < A.size(); i++) {
            indexedArr[i] = A.get(i);
        }
        Arrays.sort(indexedArr);
        for (int i = 0; i < indexedArr.length - 1; i++) {
            int diff = indexedArr[i + 1] - indexedArr[i];
            if (diff > result) {
                result = diff;
            }
        }
        return result;
    }
}

package interviewbit.level2.binarysearch;

import java.util.Arrays;
import java.util.List;

public class RotatedArray {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{20, 5, 4, 3, 13, 15, 17, 19};
        System.out.println("Result :: " + new RotatedArray().findMin(Arrays.asList(arr)));
    }

    //O(n)
    public int findMin1(final List<Integer> a) {
        int min = a.get(0);
        for (int i : a) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }

    public int findMin(final List<Integer> a) {
        int start = 0, end = a.size() - 1;
        while (start <= end) {
            if (a.get(start) <= a.get(end)) {
                return a.get(start);
            }
            int mid = (start + end) / 2;
            int prev = (mid  - 1) , next = (mid + 1);
            //int prev = (mid + a.size() - 1) / a.size(), next = (mid + 1) / a.size();
            if (a.get(mid) <= a.get(prev) && a.get(mid) <= a.get(next)) {
                return a.get(mid);
            } else if (a.get(mid) <= a.get(end)) {
                end = mid - 1;
            } else if (a.get(mid) >= a.get(start)) {
                start = mid + 1;
            }
        }
        return -1;
    }
}

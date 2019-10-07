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
        list.add(17);
        list.add(13);
        list.add(29);
        list.add(43);
        list.add(58);
        list.add(87);
        list.add(37);
        list.add(101);
        list.add(98);
        list.add(46);
        list.add(29);
        list.add(47);
        list.add(26);
        list.add(58);
        list.add(71);
        list.add(92);
        list.add(67);
        list.add(79);
        list.add(24);
        //list.add(4);
        System.out.println("Diff :: " + new MaximumConsecutiveGap().maximumGap(list));
    }

    // Method 1 with O(n)
    public int maximumGap(final List<Integer> A) {
        if (null == A || A.isEmpty() || A.size() < 2) {
            return 0;
        }
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, size = A.size();
        for (int i = 0; i < size; i++) {
            int value = A.get(i);
            if (max < value) {
                max = value;
            }
            if (min > value) {
                min = value;
            }
        }
        Bucket[] buket = new Bucket[A.size() + 1];
        for (int i = 0; i < buket.length; i++) {
            buket[i] = new Bucket();
        }
        double gap = ((double) max - (double) min) / ((double) (A.size() - 1));
        //System.out.println("Max :: " + max + ", Min :: " + min + ", Gap :: " + gap);
        for (int i = 0; i < size; i++) {
            int value = A.get(i);
            int index = (int) ((value - min) / gap);
            //System.out.println("Index :: " + index);
            if (buket[index].low == -1) {
                buket[index].low = value;
                buket[index].high = value;
            } else {
                buket[index].low = Math.min(buket[index].low, value);
                buket[index].high = Math.max(buket[index].high, value);
            }

        }
        //System.out.println(buket);
        int result = 0, prev = buket[0].high;
        for (int i = 1; i < buket.length; i++) {
            if (buket[i].low != -1) {
                result = Math.max(result, buket[i].low - prev);
                prev = buket[i].high;
            }
        }
        return result;
    }

    // Method 2 with O(n*logn)
    public int maximumGap1(final List<Integer> A) {
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

    class Bucket {
        int low;
        int high;

        public Bucket() {
            low = -1;
            high = -1;
        }

        @Override
        public String toString() {
            return "Bucket{" +
                    "low=" + low +
                    ", high=" + high +
                    '}';
        }
    }
}

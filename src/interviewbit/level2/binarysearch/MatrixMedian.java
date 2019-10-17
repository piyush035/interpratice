package interviewbit.level2.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MatrixMedian {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        list.get(0).add(1);
        list.get(0).add(3);
        list.get(0).add(5);
        list.get(1).add(2);
        list.get(1).add(6);
        list.get(1).add(9);
        list.get(2).add(3);
        list.get(2).add(6);
        list.get(2).add(9);
        System.out.println("Matrix :: " + new MatrixMedian().findMedian(list));
    }

    public int findMedian1(ArrayList<ArrayList<Integer>> A) {
        int median = 0;
        List<Integer> list = new ArrayList<>();
        for (ArrayList<Integer> arrList : A) {
            for (int i : arrList) {
                list.add(i);
            }
        }
        Collections.sort(list);
        int loc = list.size() / 2;
        median = list.get(loc);
        return median;
    }

    public int findMedian(List<List<Integer>> A) {
        /*int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;*/
        int min = findMin(A), max = findMax(A), medianSize = A.size() * A.get(0).size()/2;

        while(min <=max){
            int mid = (min+max)/2;
            int countSmall = countSmallInMatrix(A,mid);
        }
        /*while (left <= right) {
            int mid = (int) (left + ((long) right - left) / 2);
            int smaller = countSmaller1(A, mid);
            if (smaller > total / 2)
                right = mid - 1;
            else
                left = mid + 1;
        }*/
        return 0;//right;
    }

    private int countSmallInMatrix(List<List<Integer>> A, int B) {
        int count = 0;
        for(int i=0;i<A.size();i++){

        }
        /*int smaller = 0;
        for (int i = 0; i < A.size(); i++) {
            smaller += countSmaller(A.get(i), B);
        }
        return smaller;*/
    }

    private int countSmaller(final List<Integer> A, int B) {
        int left = 0, right = A.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (B <= A.get(mid))
                right = mid - 1;
            else // if B > A.get(mid)
                left = mid + 1;
        }
        return left;
    }

    private int findMin(List<List<Integer>> list) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            int value  = list.get(i).get(0);
            if (min > value) {
                min = value;
            }
        }
        return min;
    }

    private int findMax(List<List<Integer>> list) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i).get(list.get(i).size()-1);
            if (max < value) {
                max = value;
            }
        }
        return max;
    }
}

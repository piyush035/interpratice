package interviewbit.level1.arrays;

import java.util.ArrayList;

public class KthRowofPascalsTriangle {
    public static void main(String[] args) {
        System.out.println("Matrix :: " + new KthRowofPascalsTriangle().getRow(2));
    }

    private static int value(int[] arr, int index) {
        if (index < 0 || index > arr.length - 1) {
            return 0;
        }
        return arr[index];
    }

    public ArrayList<Integer> getRow(int A) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (A < 0) {
            return list;
        }
        if (A == 0) {
            list.add(1);
            return list;
        }
        int[] old = new int[]{1};
        for (int i = 1; i <= A; i++) {
            int[] arr = new int[i+1];
            for (int j = 0; j <= i; j++) {
                arr[j] = value(old,j) + value(old,j-1);
            }
            old = arr;
        }
        for (int i: old) {
            list.add(i);
        }
        return list;
    }
}

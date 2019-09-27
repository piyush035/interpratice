package interviewbit.arrays;

import java.util.ArrayList;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println("Matrix :: " + new PascalTriangle().solve(10));
    }

    private static int value(ArrayList<Integer> list, int index) {
        if (index < 0 || index > list.size() - 1) {
            return 0;
        }
        return list.get(index);
    }

    public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        if (A <= 0) {
            return list;
        }
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list.add(list1);
        if (A == 1)
            return list;
        for (int i = 1; i < A; i++) {
            list.add(new ArrayList<Integer>());
        }
        for (int i = 1; i < A; i++) {
            for (int j = 0; j <= i; j++) {
                int value = value(list.get(i - 1), j) + value(list.get(i - 1), j - 1);
                list.get(i).add(value);
            }
        }
        return list;
    }
}

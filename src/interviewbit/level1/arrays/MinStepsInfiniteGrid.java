package interviewbit.level1.arrays;

import java.util.ArrayList;

public class MinStepsInfiniteGrid {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list1.add(0);
        list1.add(1);
        list1.add(1);
        list2.add(0);
        list2.add(1);
        list2.add(2);
        System.out.println("Result :: " + new MinStepsInfiniteGrid().coverPoints(list1, list2));
    }

    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int distance = 0;
        for (int i = 1; i < A.size(); i++) {
            int x = Math.abs(A.get(i) - A.get(i - 1));
            int y = Math.abs(B.get(i) - B.get(i - 1));
            distance += Math.max(x, y);
        }
        return distance;
    }
}

package interviewbit.arrays;

import java.util.ArrayList;

public class AntiDiagonals {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        list.add(new ArrayList<Integer>());
        list.add(new ArrayList<Integer>());
        list.add(new ArrayList<Integer>());
        list.get(0).add(1);
        list.get(0).add(2);
        list.get(0).add(3);
        list.get(1).add(4);
        list.get(1).add(5);
        list.get(1).add(6);
        list.get(2).add(7);
        list.get(2).add(8);
        list.get(2).add(9);
        System.out.println("Result ::" + new AntiDiagonals().diagonal(list));
    }

    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        if (A == null || A.isEmpty()) {
            return ans;
        }
        int size = A.get(0).size();
        for (int i = 0; i < size; i++) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                list.add(A.get(j).get(i - j));
            }
            ans.add(list);
        }
        for (int i = 1; i < size; i++) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int j = i; j < size; j++) {
                list.add(A.get(j).get(size-j+i-1));
            }
            ans.add(list);
        }
        return ans;
    }
}

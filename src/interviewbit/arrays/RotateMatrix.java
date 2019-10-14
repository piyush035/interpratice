package interviewbit.arrays;

import java.util.ArrayList;

public class RotateMatrix {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        list.get(0).add(1);
        list.get(0).add(2);
        list.get(1).add(3);
        list.get(1).add(4);
        new RotateMatrix().rotate(list);
        System.out.println("Result ::" + list);
    }
    // Method 1
    public void rotate(ArrayList<ArrayList<Integer>> a) {
        if (null == a || a.isEmpty() || a.size() == 1)
            return;
        int n = a.size();
        if (n <= 1) {
            return;
        }
        int m = a.get(0).size();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[j][n - i - 1] = a.get(i).get(j);
            }
        }
        //System.out.println(arr);
        a.clear();
        for (int i = 0; i < n; i++) {
            ArrayList t = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                t.add(arr[i][j]);
            }
            a.add(new ArrayList<>(t));
        }
    }
}


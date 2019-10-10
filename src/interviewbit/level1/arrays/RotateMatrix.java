package interviewbit.level1.arrays;

import java.util.ArrayList;

public class RotateMatrix {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        list.get(0).add(1);
        list.get(0).add(2);
        list.get(0).add(3);
        list.get(0).add(4);
        list.get(1).add(5);
        list.get(1).add(6);
        list.get(1).add(7);
        list.get(1).add(8);
        list.get(2).add(9);
        list.get(2).add(10);
        list.get(2).add(11);
        list.get(2).add(12);
        list.get(3).add(13);
        list.get(3).add(14);
        list.get(3).add(15);
        list.get(3).add(16);
        new RotateMatrix().rotate(list);
        System.out.println("Matrix :: " +list );
    }
    public void rotate(ArrayList<ArrayList<Integer>> a) {
        int S = a.size() - 1;

        for(int i = 0 ; i < a.size() / 2 ; i++){


            for(int j = i; j < S - i; ++j){

                int temp1 = a.get(S-j).get(i);
                int temp2 = a.get(S-i).get(S-j);
                int temp3 = a.get(j).get(S-i);
                int temp4 = a.get(i).get(j);

                // swap
                a.get(i).set(j,temp1);
                a.get(S-j).set(i,temp2);
                a.get(S-i).set(S-j,temp3);
                a.get(j).set(S-i,temp4);
            }
        }
    }
}

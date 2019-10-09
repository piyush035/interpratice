package interviewbit.level1.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class WaveArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Matrix :: " + new WaveArray().wave(list));
    }

    public ArrayList<Integer> wave(ArrayList<Integer> A) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (null == A || A.isEmpty())
            return list;
        Collections.sort(A);
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for (int i=0;i<A.size();i++) {
            if(i%2==0){
                list2.add(A.get(i));
            }else {
                list1.add(A.get(i));
            }
        }
        int j =0;
        for (int i=0;i<A.size() ;i=i+2){
            if(j <list1.size())
                list.add(list1.get(j));
            if(j <list2.size())
                list.add(list2.get(j));
            j++;
        }
        return list;
    }
}

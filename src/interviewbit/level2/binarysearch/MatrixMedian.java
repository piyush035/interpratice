package interviewbit.level2.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MatrixMedian {
    public static void main(String[] args) {

    }

    public int findMedian(ArrayList<ArrayList<Integer>> A) {
        int median = 0;
        List<Integer> list = new ArrayList<>();
        for(ArrayList<Integer> arrList : A){
            for (int i: arrList                 ) {
                list.add(i);
            }
        }
        Collections.sort(list);
        int loc = list.size()/2;
        median = list.get(loc);
        return median;
    }
}

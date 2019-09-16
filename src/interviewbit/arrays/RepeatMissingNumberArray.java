package interviewbit.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepeatMissingNumberArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(4);
        System.out.println("Result ::" + new RepeatMissingNumberArray().repeatedNumber(list));
    }
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int size = A.size();
        long sumA1 = ((long)size *((long)size+1)/2);
        long sumA2 = (sumA1 * (2*(long)size+1)/3);
        for (int i: A ) {
            sumA1 -=(long)i;
            sumA2 -=(long)i*(long)i;
        }
        long sumAB =0;
        sumAB += sumA2/sumA1;
        long missing = (sumAB+sumA1)/2;
        long repeat = 0;
        repeat += missing - sumA1;
        list.add((int)repeat);
        list.add((int)missing);
        return  list;
    }
}

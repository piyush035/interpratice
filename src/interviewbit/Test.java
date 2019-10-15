package interviewbit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        //ArrayList<Integer> list2 = new ArrayList<Integer>();
        list1.add(0);
        list1.add(0);
        list1.add(9);
        list1.add(0);
        list1.add(9);
        list1.add(9);
        list1.add(9);
        /*list2.add(0);
        list2.add(1);
        list2.add(2);*/
        Integer[] inte = new Integer[]{1, 2, 3, 4, -10};
        List<Integer> list = Arrays.asList(inte);
        System.out.println("Result :: " + new Test().maxSubArray(list));
    }

    public int maxSubArray(final List<Integer> A) {
        int maxSoFar = Integer.MIN_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < A.size()-1; i++) {
            maxSoFar = Math.max(maxSoFar, maxSoFar + A.get(i ));
            max = Math.max(max,maxSoFar);
        }
        return max;
    }

}

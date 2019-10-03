package interviewbit.arrays;

import java.util.ArrayList;
import java.util.List;

public class DuplicateinArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);//"", "0.234601", "2.126313", "1.372403", "2.022170", "0.308558", "2.120754", "1.561462"
        list.add(4);
        list.add(1);
        list.add(4);
        list.add(1);
        System.out.println("Result ::" + new DuplicateinArray().repeatedNumber(list));
    }
    public int repeatedNumber(final List<Integer> a) {
        int[] arr = new int[a.size()];
        for (int i:a) {
            if(arr[i] == 0)
                arr[i]++;
            else
                return i;
        }
        return -1;
    }
}

package interviewbit.arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaxDistance {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(-1);//"", "0.234601", "2.126313", "1.372403", "2.022170", "0.308558", "2.120754", "1.561462"
        list.add(-1);
        list.add(2);
        //list.add(2);
        //list.add(1);
        System.out.println("Result ::" + new MaxDistance().maximumGap(list));
    }
    // Method #1 O(n*n)
    public int maximumGap1(final List<Integer> A) {
        if(null == A || A.isEmpty() )
            return -1;
        if(A.size()==1)
            return 0;
        int max = 0;
        for (int i = 0; i < A.size(); i++) {
            for (int j = i + 1; j < A.size(); j++){
                if(A.get(i)<=A.get(j) && j-i > max ){
                    max = j-i;
                }
            }
        }
        return max;
    }
    // Method #2 O(n*logn)
    public int maximumGap(final List<Integer> A) {
        if (null == A || A.isEmpty())
            return -1;
        if (A.size() == 1)
            return 0;
        List<Val> list = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            Val val = new Val(i, A.get(i));
            list.add(val);
        }
        Comparator<Val> comparator = (o1, o2) -> o1.getValue() - (o2.getValue());
        list.sort(comparator);
        int max = 0, maxIndex = list.get(list.size() - 1).getIndex();
        for (int i = list.size() - 2; i >= 0; i--) {
            max = Math.max(max, maxIndex - list.get(i).getIndex());
            maxIndex = Math.max(maxIndex, list.get(i).getIndex());
        }
        return max;
    }
}

class Val {
    private int index;
    private int value;

    public Val(int index, int value) {
        this.index = index;
        this.value = value;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

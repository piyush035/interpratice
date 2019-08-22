package interviewbit.arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AllFactors {
    public static void main(String[] args) {
        System.out.println("Result ::" + new AllFactors().allFactors(6));
    }

    public ArrayList<Integer> allFactors(int A) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        List<Integer> list1 = new LinkedList<Integer>();
        if(A <= 0 ){
            return list;
        }
        for(int i=1; i<=Math.sqrt(A);i++){
            if(A%i == 0){
                list.add(i);
                if (i != Math.sqrt(A)) {
                    list1.add(0,A/i);
                }
            }
        }
        list.addAll(list1);
        return list;
    }
}

package interviewbit.arrays;

import java.util.ArrayList;

public class MinStepsInfiniteGrid {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int distance = 0;
        for(int i = 1 ; i<A.size() ; i++){
            int x = Math.abs(A.get(i)-A.get(i-1));
            int y = Math.abs(B.get(i)-B.get(i-1));
            distance += Math.max(x,y);
        }
        return distance;
    }
}

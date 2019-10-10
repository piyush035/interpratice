package interviewbit.level1;

import java.util.ArrayList;

public class PrettyPrint {
    public static void main(String[] args) {
        System.out.println("PrettyPrint :: " + new PrettyPrint().prettyPrint(4));
    }

    public ArrayList<ArrayList<Integer>> prettyPrint(int A) {
        ArrayList<ArrayList<Integer>> resultList = new ArrayList<ArrayList<Integer>>();
        int size = 2 * A - 1;
        for (int i = 0; i < size; i++) {
            resultList.add(new ArrayList<>());
            for (int j = 0; j < size; j++) {
                resultList.get(i).add(0);
            }
        }
        int left = 0, right = size-1, top = 0, bottom = size-1, direction = 0;
        while (left <= right && top <= bottom) {
            if (direction == 0) {
                for (int i = left; i <= right; i++) {
                    resultList.get(top).set(i, A);
                }
                top++;
                direction = 1;
            }
            if (direction == 1) {
                for (int i = top; i <= bottom; i++) {
                    resultList.get(i).set(right, A);
                }
                right--;
                direction = 2;
            }
            if (direction == 2) {
                for (int i = right; i >= left; i--) {
                    resultList.get(bottom).set(i, A);
                }
                bottom--;
                direction = 3;
            }
            if (direction == 3) {
                for (int i = bottom; i >= top; i--) {
                    resultList.get(i).set(left, A);
                }
                left++;
                direction = 0;
            }
            A--;
        }
        return resultList;
    }
}

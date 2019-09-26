package interviewbit.arrays;

import java.util.ArrayList;

public class SpiralOrderMatrixII {
    public static void main(String[] args) {
        System.out.println("Matrix :: "+new SpiralOrderMatrixII().generateMatrix(80));
    }
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        ArrayList<ArrayList<Integer>> spiralOrderList = new ArrayList<ArrayList<Integer>>();
        for(int i = 0 ; i <A; i++){
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int j = 0 ; j <A; j++){
                list.add(0);
            }
            spiralOrderList.add(list);
        }
        int topRow = 0;
        int bottomRow = A - 1;
        int topLeft = 0;
        int num = 1;
        int rightCol = A - 1;
        for (int i = 0; i < A; i++) {
            for (int a = topRow; a <= rightCol; a++) {
                spiralOrderList.get(topRow).set(a, num++);
            }
            topRow++;
            for (int b = topRow; b <= bottomRow; b++) {
                spiralOrderList.get(b).set(rightCol, num++);
            }
            rightCol--;

            for (int c = rightCol; c >= topLeft; c--) {
                spiralOrderList.get(bottomRow).set(c, num++);
            }

            bottomRow--;
            for (int d = bottomRow; d > topLeft; d--) {
                spiralOrderList.get(d).set(topLeft, num++);
            }

            topLeft++;
        }

        return spiralOrderList;
    }
}

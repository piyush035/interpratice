package interviewbit.level1.arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrderMatrix {
    public static void main(String[] args) {
        List<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
        list.add(new ArrayList<String>());
        list.add(new ArrayList<String>());
        list.add(new ArrayList<String>());
        list.add(new ArrayList<String>());
        list.add(new ArrayList<String>());
        list.get(0).add("a");
        list.get(0).add("b");
        list.get(0).add("c");
        list.get(0).add("d");
        list.get(0).add("e");
        list.get(1).add("f");
        list.get(1).add("g");
        list.get(1).add("h");
        list.get(1).add("i");
        list.get(1).add("j");
        list.get(2).add("k");
        list.get(2).add("l");
        list.get(2).add("m");
        list.get(2).add("n");
        list.get(2).add("o");
        list.get(3).add("p");
        list.get(3).add("q");
        list.get(3).add("r");
        list.get(3).add("s");
        list.get(3).add("t");
        list.get(4).add("u");
        list.get(4).add("v");
        list.get(4).add("w");
        list.get(4).add("x");
        list.get(4).add("y");
        SpiralOrderMatrix spiralOrderMatrix = new SpiralOrderMatrix();
        for (String str: spiralOrderMatrix.spiralOrder(list)) {
            System.out.print(str +" ");
        }
    }

    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<String> spiralOrder(final List<ArrayList<String>> A) {
        ArrayList<String> spiralOrderList = new ArrayList<>();
        int coloumn = A.get(0).size(), rows = A.size();
        int top = 0, left = 0, right = coloumn-1, bottom =  rows-1, direction = 0;
        while(left <= right && top <= bottom){
            if(direction == 0){
                for(int i = left ; i <= right; i++){
                    spiralOrderList.add(A.get(top).get(i));
                }
                top++;
                direction = 1;
            }
            if(direction == 1){
                for(int i = top ; i <= bottom; i++){
                    spiralOrderList.add(A.get(i).get(right));
                }
                right--;
                direction = 2;
            }
            if(direction == 2){
                for(int i = right ; i >= left; i--){
                    spiralOrderList.add(A.get(bottom).get(i));
                }
                bottom--;
                direction = 3;
            }
            if(direction == 3){
                for(int i = bottom ; i >= top; i--){
                    spiralOrderList.add(A.get(i).get(left));
                }
                left++;
                direction = 0;
            }
        }
        return spiralOrderList;
    }
}
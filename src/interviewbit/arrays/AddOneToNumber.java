package interviewbit.arrays;

import java.util.ArrayList;

public class AddOneToNumber {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int lastValue = A.get(A.size()-1);
        int carry = 0;
        if(lastValue == 9){
            for (int i = A.size()-1; i >=0; i--) {
                int temp = A.get(i);
                if(temp == 9){
                    A.set(i,0);
                    carry = 1;
                    if(i == 0){
                        list.add(1);
                    }
                    continue;
                }
                A.set(i,A.get(i)+carry);
                break;
            }
        }else{
            A.set(A.size()-1,A.get(A.size()-1)+1);
        }
        boolean zeros = false;
        for (int i = 0; i < A.size(); i++) {
            if(A.get(i) != 0 || !list.isEmpty()){
                zeros =true;
                list.add(A.get(i));
            }
           /* if(A.get(i) == 0 && zeros){
                list.add(A.get(i));
            }*/
        }
        return list;
    }
    public static void main(String[] args){
        ArrayList<Integer> A = new ArrayList<Integer>();
        //0, 3, 7, 6, 4, 0, 5, 5, 5
        A.add(9);
        A.add(9);
        A.add(9);/*
        A.add(6);
        A.add(4);
        A.add(0);
        A.add(5);
        A.add(5);
        A.add(5);*/
        AddOneToNumber addOneToNumber = new AddOneToNumber();
        //addOneToNumber.plusOne(A);
        System.out.println(addOneToNumber.plusOne(A));
    }
}

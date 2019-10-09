package interviewbit.level1.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetMatrixZeros {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        list.get(0).add(1);
        list.get(0).add(0);
        list.get(0).add(1);
        list.get(1).add(1);
        list.get(1).add(1);
        list.get(1).add(1);
        list.get(2).add(1);
        list.get(2).add(1);
        list.get(2).add(1);
        new SetMatrixZeros().SetMatrixZeros(list);
        System.out.println("Result :: " + list);
    }

    public void SetMatrixZeros(List<List<Integer>> a) {
        Set<Integer> rows = new HashSet<>();
        Set<Integer> colm = new HashSet<>();
        for(int i=0;i<a.size();i++){
            for (int j=0;j<a.get(i).size();j++){
                if(a.get(i).get(j) == 0){
                    rows.add(i);
                    colm.add(j);
                }
            }
        }
        for (int i:rows){
            for (int j=0;j<a.get(i).size();j++){
                a.get(i).set(j,0);
            }
        }
        for (int i:colm){
            for (int j=0;j<a.size();j++){
                a.get(j).set(i,0);
            }
        }
    }
}

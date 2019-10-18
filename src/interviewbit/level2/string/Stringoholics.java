package interviewbit.level2.string;

import java.util.ArrayList;
import java.util.List;

public class Stringoholics {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("ababa");
        list.add("aba");
        System.out.println("Stringoholics :: " + new Stringoholics().solve(list));
    }

    public int solve(ArrayList<String> A) {
        if (null == A || A.isEmpty()) {
            return 0;
        }
        long size = A.size(), maxSize = (long) Math.pow(10, 5);
        if (size > maxSize) {
            return 0;
        }
        int ans = 0;
        List<List<Integer>> list = new ArrayList<>();
        for (String str : A) {
            List<Integer> list1 = new ArrayList<>();
            for (int i = 0; i < str.length()-1; i++) {
                char charTemp1 = str.charAt(i), charTemp2 = str.charAt(i + 1);
                char[] charArr = str.toCharArray();
                charArr[i] = charTemp2;
                charArr[i+1] = charTemp1;
                String str1 = new String(charArr);
                if(str.equals(str1)){
                    list1.add(i);
                }
                list.add(list1);
            }
        }
        return ans;
    }
}

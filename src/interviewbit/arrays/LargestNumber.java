package interviewbit.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(30);
        list.add(34);
        list.add(5);
        list.add(9);//list.add(3);
        System.out.println("Result ::" + new LargestNumber().largestNumber(list));
    }

    public String largestNumber(final List<Integer> A) {
        Collections.sort(A, new Comparator<Integer> () {
            public int compare(Integer a, Integer b) {
                String s1 = Integer.toString(a);
                String s2 = Integer.toString(b);
                int i = 0, j =0, n1 =0, n2 =0;

                while(n1 < s1.length() + s2.length() || n2 < s1.length() + s2.length()) {
                    while(i < s1.length() && j < s2.length()) {
                        char ch1 = s1.charAt(i);
                        char ch2 = s2.charAt(j);
                        if (ch1 != ch2) {
                            return Character.compare(ch2, ch1);
                        }
                        i++; j++;
                        n1++; n2++;
                    }

                    i = i % s1.length();
                    j = j % s2.length();
                }

                return 0;
            }
        });
        StringBuilder sb = new StringBuilder();
        for (Integer n : A) {
            if (!(sb.length() == 0 && n == 0))
                sb.append(n);
        }

        if (sb.length() == 0)
            return "0";
        return sb.toString();
    }

}

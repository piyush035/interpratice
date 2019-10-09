package interviewbit.level1.arrays;

import java.util.ArrayList;

public class TripletsWithSumBetweenGivenRange {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("0.366507");//"", "0.234601", "2.126313", "1.372403", "2.022170", "0.308558", "2.120754", "1.561462"
        list.add("0.234601");
        list.add("2.126313");
        list.add("1.372403");
        list.add("2.022170");
        list.add("0.308558");
        list.add("2.120754");
        list.add("1.561462");
        System.out.println("Result ::" + new TripletsWithSumBetweenGivenRange().solve(list));
    }

    public int solve(ArrayList<String> A) {
        double a = Double.parseDouble(A.get(0));
        double b = Double.parseDouble(A.get(1));
        double c = Double.parseDouble(A.get(2));

        for (int i = 3; i < A.size(); i++) {
            if ((a + b + c) > 1.0 && (a + b + c) < 2) {
                return 1;
            } else if ((a + b + c) >= 2) {
                if (a > c && a > b) {
                    a = Double.parseDouble(A.get(i));
                } else if (b > c && b > a) {
                    b = Double.parseDouble(A.get(i));
                } else {
                    c = Double.parseDouble(A.get(i));
                }
            } else {
                if (a < c && a < b) {
                    a = Double.parseDouble(A.get(i));
                } else if (b < c && b < a) {
                    b = Double.parseDouble(A.get(i));
                } else {
                    c = Double.parseDouble(A.get(i));
                }
            }
        }
        if ((a + b + c) > 1 && (a + b + c) < 2) {
            return 1;
        }
        return 0;
    }
}

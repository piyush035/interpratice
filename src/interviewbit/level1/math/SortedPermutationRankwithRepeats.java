package interviewbit.level1.math;

import java.util.HashMap;
import java.util.Map;

public class SortedPermutationRankwithRepeats {
    public static void main(String[] args) {
        System.out.println("SortedPermutationRankwithRepeats ::" + new SortedPermutationRankwithRepeats().findRank("aba"));
    }

    public int findRank(String A) {
        int rank = 1, size = A.length();
        int count = 0;
        for (int i = 0; i < size; i++) {
            int lessThan = 0;
            for (int j = i + 1; j < size; j++) {
                if (A.charAt(i) > A.charAt(j)) {
                    lessThan++;
                }
            }
            Map<Character, Integer> map = new HashMap<>();
            for (int j = i; j < size; j++) {
                if (map.containsKey(A.charAt(j))) {
                    int value = map.get(A.charAt(j));
                    map.put(A.charAt(j), value + 1);
                } else {
                    map.put(A.charAt(j), 1);
                }
            }
            int fact = 1;
            for (Map.Entry<Character, Integer> ele : map.entrySet()) {
                fact *= factorial(ele.getValue());
            }
            rank += ((factorial(size - i - 1) * lessThan) / fact);
            rank = rank % 1000003;

        }
        return rank;
    }

    private int smaller(String str, int low, int high) {
        char c = str.charAt(low);
        int count = 0;
        for (int i = low + 1; i <= high; i++) {
            if (c > str.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    private int factorial(int fact) {
        if (fact <= 1) {
            return fact;
        }
        return fact * factorial(fact - 1) % 1000003;
    }
}

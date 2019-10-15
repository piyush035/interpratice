package interviewbit.level2.binarysearch;

import java.util.Arrays;
import java.util.List;

public class CountElementOccurence {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 3, 3, 3, 3, 13, 15, 17, 19};
        System.out.println("Result :: " + new CountElementOccurence().findCount2(Arrays.asList(arr), 3));
    }

    private int binarySearch(List<Integer> arr, int target, boolean searchFirst) {
        int start = 0, end = arr.size() - 1, result = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr.get(mid) == target) {
                result = mid;
                if (searchFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (arr.get(mid) > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    private int binarySearch1(List<Integer> arr, int target) {
        int start = 0, end = arr.size() - 1, mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr.get(mid) == target) {
                return mid;
            } else if (arr.get(mid) > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    // O(logn)
    public int findCount2(final List<Integer> A, int B) {
        int startIndex = binarySearch(A, B, true);
        int lastIndex = binarySearch(A, B, false);
        if (startIndex < 0) {
            return 0;
        }
        return lastIndex - startIndex + 1;
    }

    // O(logn)+ O(n)
    public int findCount(final List<Integer> A, int B) {
        int index = binarySearch1(A, B);
        if (index < 0) {
            return 0;
        }
        int count = 0;
        for (int i = index; i < A.size(); i++) {
            if (A.get(i) != B) {
                break;
            } else {
                count++;
            }
        }
        for (int i = index - 1; i >= 0; i--) {
            if (A.get(i) != B) {
                break;
            } else {
                count++;
            }
        }
        return count;
    }

    // O(n)
    public int findCount1(final List<Integer> A, int B) {
        int count = 0;
        for (int i : A) {
            if (i == B) {
                count++;
            } else if (i < B) {
                continue;
            } else {
                break;
            }
        }
        return count;
    }
}

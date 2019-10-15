package interviewbit.level2.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 7, 11, 13, 15, 17, 19};
        System.out.println("Result :: " + binarySearch(arr, 17));
    }

    /**
     * Return the index of element if available otherwise -1
     *
     * @param arr
     * @param target
     * @return
     */
    public static int binarySearch(int arr[], int target) {
        int start = 0, end = arr.length - 1, mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}

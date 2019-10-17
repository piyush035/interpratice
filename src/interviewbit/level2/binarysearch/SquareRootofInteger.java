package interviewbit.level2.binarysearch;

public class SquareRootofInteger {
    public static void main(String[] args) {
        System.out.println("Square Root :: " + new SquareRootofInteger().sqrt(2147483647));
    }
    //O(log(a))
    public int sqrt(int a) {
        int sqrt = 0, start=0, end=a;
        while(start<=end){
            int mid = (start+end)/2;
            long pow = (long)mid* (long)mid;
            if(pow == a){
                return mid;
            }else if(pow > a){
                end = mid-1;
            }else if(pow < a){
                start = mid+1;
                sqrt = mid;
            }
        }
        return sqrt;
    }
    //O(sqrt(a))
    public int sqrt1(int a) {
        int sqrt = 0;
        for (int i = 1; i <= a / 2; i++) {
            if (i * i <= a) {
                sqrt = i;
            }
        }
        return sqrt;
    }
}

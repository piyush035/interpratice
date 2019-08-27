package interviewbit.math;

//reverse-2,147,483,648 to 2,147,483, 647
public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println("Result ::" + new ReverseInteger().reverse(-2021));
    }

    public int reverse(int A) {
        boolean negativeFlag = false;
        if (A < 0) {
            negativeFlag = true;
            A = -A;
        }
        int rev_num = 0, prev_rev_num = 0;
        while (A != 0) {
            int curr_digit = A % 10;
            rev_num = (rev_num * 10) + curr_digit;
            if ((rev_num - curr_digit) / 10 != prev_rev_num) {
                return 0;
            }
            prev_rev_num = rev_num;
            A /= 10;
        }
        return (negativeFlag == true) ? -rev_num : rev_num;
    }
}

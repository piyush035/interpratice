package interviewbit.level1.math;

public class PowerOfTwoIntegers {

    public int isPower(int A) {
        if(A == 1){
            return 1;
        }
        for(int i=2; i<=Math.sqrt(A);i++){
            double f = Math.log(A)/Math.log(i);
            if((f - (int)f) < 0.00000001){
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("Result ::" + new PowerOfTwoIntegers().isPower(2));
    }
}

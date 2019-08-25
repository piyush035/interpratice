package interviewbit.math;

import java.util.ArrayList;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("Result ::" + new FizzBuzz().fizzBuzz(5));
    }
    public ArrayList<String> fizzBuzz(int A) {
        ArrayList<String> list = new ArrayList<String>();
        for(int i=1;i<=A;i++){
            if(i%3==0 && i%5 ==0){
                list.add(i-1,"FizzBuzz");
            }else if(i%3==0){
                list.add(i-1,"Fizz");
            }else if(i%5==0){
                list.add(i-1,"Buzz");
            }else {
                list.add(i-1,Integer.toString(i));
            }
        }
        return list;
    }
}

package interviewbit.math;

import java.util.ArrayList;
import java.util.List;

public class ExcelColumnNumber {
    public static void main(String[] args) {
        System.out.println("Result ::" + new ExcelColumnNumber().titleToNumber("ABC"));
    }
    public int titleToNumber(String A) {
        int result = 0;
        List<String> list = new ArrayList<String>();
        list.add("A");list.add("B");list.add("C");list.add("D");list.add("E");list.add("F");list.add("G");list.add("H");list.add("I");list.add("J");list.add("K");
        list.add("L");list.add("M");list.add("N");list.add("O");list.add("P");list.add("Q");list.add("R");list.add("S");list.add("T");list.add("U");list.add("V");
        list.add("W");list.add("X");list.add("Y");list.add("Z");
        char[] chars = A.toCharArray();
        for (int i=0; i<chars.length;i++){
            result += result*25 + list.indexOf(""+chars[i])+1;
        }
        return result;
    }
}

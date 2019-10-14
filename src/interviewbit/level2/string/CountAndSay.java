package interviewbit.level2.string;

public class CountAndSay {
    public static void main(String[] args) {
        System.out.println("Matrix :: " + new CountAndSay().countAndSay(4));
    }

    public String countAndSay(int A) {
        if (A <= 0) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        if (A == 1) {
            return "1";
        }
        StringBuilder temp = new StringBuilder("1");
        int count = 1;
        while (A >= 2) {
            int j = 0, len = temp.length();
            while (j < len) {
                if (j + 1 != len && temp.charAt(j) == temp.charAt(j + 1)) {
                    count++;
                }else {
                    result.append(count).append(temp.charAt(j));
                    count = 1;
                }
                j++;
            }
            temp=result;
            result = new StringBuilder();
            A--;
        }
        return temp.toString();
    }
}

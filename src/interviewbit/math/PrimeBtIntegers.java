package interviewbit.math;

import java.util.Scanner;

public class PrimeBtIntegers {
    private static final String CHARSET_NAME = "UTF-8";

    private static boolean isPrime(int prime) {
        if(prime <=1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(prime); i++) {
            if(prime%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new java.io.BufferedInputStream(System.in), CHARSET_NAME);
        int totalNumber = Integer.parseInt(args[0]);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            for (int i = a; i <= b; i++) {
                if(isPrime(i)){
                    System.out.println(i);
                }
            }
            System.out.println();
        }
    }

    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true) {
            int n = in.nextInt();
            if (n == 42) break;
            System.out.println(n);
        }
    }*/
}

package interviewbit.level1.arrays;

import java.util.HashMap;
import java.util.Map;

public class Lottery {
    public static void main(String[] args) {
        System.out.println(lotteryCoupons(22));
    }
    public static int lotteryCoupons(int n) {
        // Write your code here
        int result = 0;
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        if(n < 10){
            return n;
        }
        if(n>9){
            for(int i=0; i<n; i++){
                if(i > 9){
                    arr[i] = getSum(i);
                }else{
                    arr[i] = i;
                }
            }
        }
        for(int i=0; i<n; i++){
            arr1[arr[i]]++;
        }
        int freq = mostFrequent(arr,n);
        result = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == freq)
                result++;
        }
        return result;
    }

    public static int mostFrequent(int arr[], int n){

        // Insert all elements in hash
        Map<Integer, Integer> hp =
                new HashMap<>();

        for(int i = 0; i < n; i++)
        {
            int key = arr[i];
            if(hp.containsKey(key))
            {
                int freq = hp.get(key);
                freq++;
                hp.put(key, freq);
            }
            else
            {
                hp.put(key, 1);
            }
        }

        // find max frequency.
        int max_count = 0, res = -1;

        for(Map.Entry<Integer, Integer> val : hp.entrySet())
        {
            if (max_count < val.getValue())
            {
                res = val.getKey();
                max_count = val.getValue();
            }
        }

        return res;
    }

    public static int getSum(int n)
    {
        int sum;

        /* Single line that calculates sum */
        for (sum = 0; n > 0; sum += n % 10,
                n /= 10);

        return sum;
    }
}

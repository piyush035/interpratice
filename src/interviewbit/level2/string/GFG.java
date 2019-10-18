package interviewbit.level2.string;

/**
 * determine minimum number of rotations required to yield same string
 */
public class GFG {
    public int findRotations(String str) {
        String tmp = str + str;
        int n = str.length();
        for (int i = 1; i <= n; i++) {
            String substring = tmp.substring(i, str.length()+i);
            if (str.equals(substring))
                return i;
        }
        return n;
    }
    public static void main(String[] args)
    {
        String str = "100100";
        System.out.println(new GFG().findRotations(str));
    }
}

package hu.crs;

public class Sum {
    public static int sum1(final int first, final int last) {
        int sum = 0;
        int i = first;
        while (i <= last) {
            sum = sum + i;
            i++;
        }
        return sum;
    }

    public static int sum2(int first, int last) {
        int result = 0;
        for (int i = first; i <= last; i++) {
            result = result + i;
        }
        return result;
    }
}

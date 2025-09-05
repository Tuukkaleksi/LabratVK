package labravk1.files;

public class ArrayStats {
    public static double average(int[] a) {
        if (a.length == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int num : a) {
            sum += num;
        }
        return (double) sum / a.length;
    }

    public static int max(int[] a) {
        if (a.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = a[0];
        for (int num : a) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}

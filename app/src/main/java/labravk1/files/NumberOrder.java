package labravk1.files;

public class NumberOrder {
    public static String order2(int a, int b) {
        if (a < b) {
            return a + "," + b;
        } else {
            return b + "," + a;
        }
    }

    public static String order3(int a, int b, int c) {
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int mid = (a + b + c) - min - max;
        return min + "," + mid + "," + max;
    }
}

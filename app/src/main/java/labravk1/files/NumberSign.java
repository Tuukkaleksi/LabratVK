package labravk1.files;

public class NumberSign {
    public static String sign(int n) {
        if (n > 0) {
            return "positiivinen";
        } else if (n < 0) {
            return "negatiivinen";
        } else {
            return "nolla";
        }
    }
}

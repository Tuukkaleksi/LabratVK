package labravk1.files;

public class TimesTable {
    public static String line(int n, int i) {
        int tulos = n * i;
        return n + " x " + i + " = " + tulos + "\n";
    }

    public static String table10(int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            result.append(n).append(" x ").append(i).append(" = ").append(n * i).append("\n");
        }
        return result.toString();
    }
}

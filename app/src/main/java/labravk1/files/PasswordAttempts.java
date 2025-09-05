package labravk1.files;

public class PasswordAttempts {
    public static boolean check(String s) {
        String correctPassword = "java123";
        if (s == null) {
            return false;
        }
        if (s.equals(correctPassword)) {
            return true;
        } else {
            return false;
        }
    }

    public static String login(String[] tries) {
        int m = Math.min(3, tries.length);
        String correctPassword = "java123";
        for (int i = 0; i < m; i++) {
            if (tries[i].equals(correctPassword)) {
                return "Tervetuloa!";
            }
        }
        return "Liian monta virheellistä yritystä.";
    }
}

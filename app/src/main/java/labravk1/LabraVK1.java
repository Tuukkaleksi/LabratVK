package labravk1;

public class LabraVK1 {
    // Tehtävä 1.
    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    } 
    // Tehtävä 2.
    public static String sign(int n) {
        if (n > 0) {
            return "positiivinen";
        } else if (n < 0) {
            return "negatiivinen";
        } else {
            return "nolla";
        }
    }
    // Tehtävä 3.
    public static String describe(int n) {
        if (n > 0 && n % 2 == 0) {
            return "positiivinen parillinen";
        } else if (n > 0 && n % 2 != 0) {
            return "positiivinen pariton";
        } else if (n == 0) {
            return "nolla";
        } else if (n < 0 && n % 2 == 0) {
            return "negatiivinen parillinen";
        } else if (n < 0 && n % 2 != 0) {
            return "negatiivinen pariton";
        }
        return null;
    }
    // Tehtävä 4.
    public static String order2(int a, int b) {
        if (a < b) {
            return a + "," + b;
        } else {
            return b + "," + a;
        }
    }
    // Tehtävä 5.
    public static String order3(int a, int b, int c) {
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int mid = (a + b + c) - min - max;
        return min + "," + mid + "," + max;
    }
    // Tehtävä 6.
    public static String line(int n, int i) {
        int tulos = n * i;
        return n + " x " + i + " = " + tulos + "\n";
    }
    // Tehtävä 7.
    public static String table10(int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            result.append(n).append(" x ").append(i).append(" = ").append(n * i).append("\n");
        }
        return result.toString();
    }
    // Tehtävä 8.
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
    // Tehtävä 9.
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
    // Tehtävä 10.
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

    public static void main(String[] args) {
        System.out.println("==isEven Testausta");
        boolean kahdeksan = isEven(8);
        boolean seitseman = isEven(7);
        boolean nolla = isEven(0);
        System.out.println("8 on: " + kahdeksan);
        System.out.println("7 on: " + seitseman);
        System.out.println("0 on: " + nolla);

        System.out.println("\n==Sign Testausta");
        String luvunMerkki = sign(-5);
        String luvunMerkki2 = sign(5);
        System.out.println("-5 on " + luvunMerkki);
        System.out.println("5 on " + luvunMerkki2);

        System.out.println("\n==Describe Testausta");
        String kuvaus1 = describe(8);
        String kuvaus2 = describe(-5);
        String kuvaus3 = describe(0);
        System.out.println("8 on " + kuvaus1);
        System.out.println("-5 on " + kuvaus2);
        System.out.println("0 on " + kuvaus3);

        System.out.println("\n==Order2 Testausta");
        String jarjestys1 = order2(5, 2);
        String jarjestys2 = order2(3,3);
        System.out.println("5 ja 2 jarjestyksessa: " + jarjestys1);
        System.out.println("3 ja 3 jarjestyksessa: " + jarjestys2);

        System.out.println("\n==Order3 Testausta");
        String jarjestys3 = order3(5, 2, 9);
        String jarjestys4 = order3(3,7,3);
        System.out.println("5, 2 ja 9 jarjestyksessa: " + jarjestys3);
        System.out.println("3, 7 ja 3 jarjestyksessa: " + jarjestys4);

        System.out.println("\n==Line Testausta");
        String rivi = line(5, 1);
        System.out.println(rivi);

        System.out.println("\n==Table10 Testausta");
        String taulukko = table10(1);
        System.out.println(taulukko);

        System.out.println("\n==Check Testausta");
        boolean tarkistus1 = check("java123");
        boolean tarkistus2 = check("väärä");
        System.out.println("Oikea salasana: " + tarkistus1);
        System.out.println("Väärä salasana: " + tarkistus2);

        System.out.println("\n==Login Testausta");
        String[] yritykset1 = {"no", "java123", "x"};
        String[] yritykset2 = {"no", "wrong", "x", "java123"};
        String kirjautuminen1 = login(yritykset1);
        String kirjautuminen2 = login(yritykset2);
        System.out.println("Yritykset 1: " + kirjautuminen1);
        System.out.println("Yritykset 2: " + kirjautuminen2);

        System.out.println("\n==Average/Max Testausta");
        int[] luvut1 = {5, 10, 15};
        int[] luvut2 = {-1, 20, 3, 7};
        int[] luvut3 = {};
        double keskiarvo1 = average(luvut1);
        int suurin1 = max(luvut2);
        double keskiarvo2 = average(luvut3);
        int suurin2 = max(luvut3);
        System.out.println("Lukujen {5,10,15} keskiarvo: " + keskiarvo1);
        System.out.println("Lukujen {-1,20,3,7} suurin: " + suurin1);
        System.out.println("Tyhjän taulukon keskiarvo: " + keskiarvo2);
        System.out.println("Tyhjän taulukon suurin: " + suurin2);
    }
}

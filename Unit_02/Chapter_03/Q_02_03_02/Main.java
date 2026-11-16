package Unit_02.Chapter_03.Q_02_03_02;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        int r = 0;
        int s = 0;
        int t = 0;
        int l = 0;
        int n = 0;
        int e = 0;
        for (int i = 0; i < a.length(); i++) {
            String b = Character.toString(a.charAt(i));
            if (b.toLowerCase().equals("r")) {
                r += 1;
            } else if (b.toLowerCase().equals("s")) {
                s += 1;
            } else if (b.toLowerCase().equals("t")) {
                t += 1;
            } else if (b.toLowerCase().equals("l")) {
                l += 1;
            } else if (b.toLowerCase().equals("n")) {
                n += 1;
            } else if (b.toLowerCase().equals("e")) {
                e += 1;
            }
        }
        System.out.printf("R: %s\n", r);
        System.out.printf("S: %s\n", s);
        System.out.printf("T: %s\n", t);
        System.out.printf("L: %s\n", l);
        System.out.printf("N: %s\n", n);
        System.out.printf("E: %s\n", e);
        scan.close();
    }
}

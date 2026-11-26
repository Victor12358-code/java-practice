package Unit_02.Chapter_05.Q_02_05_02;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int j = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < j; i++) {
            for (int u = 0; u < j; u++) {
                System.out.printf("%s ", (i + 1) * (u + 1));
            }
            System.out.print("\n");
        }
        scan.close();
    }
}

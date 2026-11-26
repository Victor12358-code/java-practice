package Unit_02.Chapter_05.Q_02_05_01;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = Integer.parseInt(scan.nextLine());
        int w = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < h; i++) {
            for (int u = 0; u < w; u++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        scan.close();
    }
}
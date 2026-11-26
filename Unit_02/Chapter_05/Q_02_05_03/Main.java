package Unit_02.Chapter_05.Q_02_05_03;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p = Integer.parseInt(scan.nextLine());
        for (int i = p; i > 0; i--) {
            for (int u = i; u > 0; u--) {
                System.out.printf("%s ", u);
            }
            System.out.print("\n");        
        }
        scan.close();
    }
}
package Unit_02.Chapter_03.Q_02_03_04;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int k = Integer.parseInt(scan.nextLine());
        for (int i = a; i <= b; i += k) {
            System.out.println(i);
        }
        scan.close();
    }
}

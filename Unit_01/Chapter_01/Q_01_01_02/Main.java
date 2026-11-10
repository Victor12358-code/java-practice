package Unit_01.Chapter_01.Q_01_01_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        double H = Double.parseDouble(scan.nextLine());
        double W = Double.parseDouble(scan.nextLine());
        double A = H * W;
        System.out.print(A);
        scan.close();
    }
}

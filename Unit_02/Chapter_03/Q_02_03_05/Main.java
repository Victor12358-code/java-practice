package Unit_02.Chapter_03.Q_02_03_05;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        for (int i = a; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("Lift off! We have lift off! Good luck Luna!");
        scan.close();
    }
}
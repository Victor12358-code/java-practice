package Unit_02.Chapter_02.Q_02_02_07;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Y = Integer.parseInt(scan.nextLine());
        if (Y % 4 == 0 && Y % 100 != 0 || Y % 400 == 0) {
            System.out.println("leap year");
        } else {
            System.out.println("not a leap year");
        }
        scan.close();
    }
}
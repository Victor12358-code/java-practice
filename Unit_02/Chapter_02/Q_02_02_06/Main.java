package Unit_02.Chapter_02.Q_02_02_06;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double S = Double.parseDouble(scan.nextLine());
        if (S <= 58523) {
            System.out.println(1);
        } else if (S <= 117045) {
            System.out.println(2);
        } else if (S <= 181440) {
            System.out.println(3);
        } else if (S <= 258482) {
            System.out.println(4);
        } else {
            System.out.println(5);
        }
        scan.close();
    }
}
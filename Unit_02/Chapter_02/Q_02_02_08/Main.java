package Unit_02.Chapter_02.Q_02_02_08;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
        if ((a + b <= c) || (a + c <= b) || (b + c <= a) || a == 0 || b == 0 || c == 0) {
            System.out.println("not a triangle");
        } else if (a == b && b == c) {
            System.out.println("equilateral");
        } else if (a != b && b != c) {
            System.out.println("scalene");
        } else {
            System.out.println("isosceles");
        }
        scan.close();
    }
}
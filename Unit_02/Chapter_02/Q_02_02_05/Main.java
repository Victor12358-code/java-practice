package Unit_02.Chapter_02.Q_02_02_05;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int D = Integer.parseInt(scan.nextLine());
        if (D == 1) {
            System.out.println("Sunday");
        } else if (D == 2) {
            System.out.println("Monday");
        } else if (D == 3) {
            System.out.println("Tuesday");
        } else if (D == 4) {
            System.out.println("Wednesday");
        } else if (D == 5) {
            System.out.println("Thursday");
        } else if (D == 6) {
            System.out.println("Friday");
        } else if (D == 7) {
            System.out.println("Saturday");
        } else {
            System.out.println("invalid argument");
        }
        scan.close();
    }
}
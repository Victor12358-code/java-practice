package Unit_02.Chapter_02.Q_02_02_03;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = Integer.parseInt(scan.nextLine());
        if (h >= 80) {
            System.out.print("healthy");
        } else if (h >= 60) {
            System.out.print("bloody nose");
        } else if (h >= 40) {
            System.out.print("face swollen");
        } else if (h >= 20) {
            System.out.print("eyes bloodshot, face bleeding");
        } else if (h >= 1) {
            System.out.print("even more blood");
        } else {
            System.out.print("eyes closed. Game Over");
        }
        scan.close();       
    }
}
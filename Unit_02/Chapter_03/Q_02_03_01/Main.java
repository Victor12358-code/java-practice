package Unit_02.Chapter_03.Q_02_03_01;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer N = Integer.parseInt(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());
        int min = n;
        int max = n;
        for (int i = 1; i <= N - 1; i++) { 
            n = Integer.parseInt(scan.nextLine());
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);
        scan.close();
    }
}
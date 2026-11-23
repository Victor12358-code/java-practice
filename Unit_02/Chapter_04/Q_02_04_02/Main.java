package Unit_02.Chapter_04.Q_02_04_02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());
        int third = Integer.parseInt(scan.nextLine());
        int N = 1;
        int total = first + second + third;
        while (first + second + third != 180) {
            N++;
            first = Integer.parseInt(scan.nextLine());
            second = Integer.parseInt(scan.nextLine());
            third = Integer.parseInt(scan.nextLine());
            total += first + second + third;
        }
        if (N == 1) {
            System.out.printf("It took %s turn to hit 180.\nTotal points thrown: %s", N, total);
        } else {
            System.out.printf("It took %s turns to hit 180.\nTotal points thrown: %s", N, total);
        }
        scan.close();
    }
}

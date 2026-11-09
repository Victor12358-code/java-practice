package Unit_01.Chapter_01.Q_01_01_01;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name: ");
        String N = scan.nextLine();
        System.out.println(String.format("Good evening, %s!",N));
        scan.close();
    }
}

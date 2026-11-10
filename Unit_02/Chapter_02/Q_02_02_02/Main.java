package Unit_02.Chapter_02.Q_02_02_02;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String country = scan.nextLine();
        if (country.equals("Argentina")) {
            System.out.print("Lionel Messi");
        } else if (country.equals("Portugal")) {
            System.out.print("Cristiano Ronaldo");
        } else {
            System.out.print("no preference");
        }
        scan.close();
    }
}

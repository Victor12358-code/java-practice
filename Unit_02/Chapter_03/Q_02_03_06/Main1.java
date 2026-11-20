package Unit_02.Chapter_03.Q_02_03_06;

import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        int index = 0;
        int count = 0;
        for (int i = 0; i <= a.length() - b.length(); i++) {
            if (a.substring(i,i + b.length()).equals(b)) {
                count ++;
                if (count == 1) {
                    System.out.println(String.format("First occurrence: %s", index));
                }
                if (count == 3) {
                    System.out.println(String.format("Third occurrence: %s", index));
                }
            }
            index++;
        }
        scan.close();
    }
}

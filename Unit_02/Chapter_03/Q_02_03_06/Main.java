package Unit_02.Chapter_03.Q_02_03_06;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        char b = scan.nextLine().charAt(0);
        int count = 0;
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < a.length() && count < 1; i += 1) {
             if (a.charAt(i) == b) {
                count++;
                index1 = i;
            }
            index2++;
        }
        
        count = 0;
        for (int u = 0; u < a.length() && count < 3; u += 1) {
             if (a.charAt(u) == b) {
                count++;
                index2 = u;
            }    
        }    
        System.out.printf("First occurrence: %d\nThird occurrence: %d", index1, index2);
    }
}


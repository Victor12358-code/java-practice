package Unit_02.Chapter_03.Q_02_03_06;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        int index1 = 0;
        int index2 = 0;
        
        int count = 0;
        for (int i = 0; i < a.length() && count < 1; i += 1) {
             if (a.substring(i,i + b.length()).equals(b)) {
                count++;
                index1 = i;
            }
            index2++;
        }
        
        count = 0;
        for (int u = 0; u < a.length() && count < 3; u += 1) {
             if (a.substring(u,u + b.length()).equals(b)) {
                count++;
                index2 = u;
            }    
        }    
        System.out.printf("First occurrence: %s\nThird occurrence: %s", index1, index2);
        scan.close();
    }
}

package Unit_02.Chapter_02.Q_02_02_01;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // this is a comment
        Scanner scan = new Scanner(System.in);
            
        int a = Integer.parseInt(scan.nextLine());
        if (a % 3 == 0) {
            if (a % 5 == 0) {
                System.out.print("Fizz Buzz");
            } else {
                System.out.print("Fizz");
            }
        } else{
            if (a % 5 == 0) {
                System.out.print("Buzz");
            } else {
                System.out.print(a);
            }
        }
        scan.close();

    }
}

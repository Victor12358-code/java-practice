package Unit_02.Chapter_02.Q_02_02_04;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalM = 500;
        int dailyM = 250;
        boolean condition = false;
        String pass = scan.nextLine();
        if (pass.length() !=4) {
            System.out.println("Invalid PIN length entered. Goodbye.");
        } else {
            System.out.println("New PIN stored.");
            String pass1 = scan.nextLine();
            if (pass1.length() !=4) {
                System.out.println("Invalid PIN length entered. Goodbye.");
            } else if (pass1.equals(pass) != true) {
                System.out.println("Invalid PIN entered. Goodbye.");
            } else {           
                condition = true;
            }
        }
        if (condition == true) {
            int M = Integer.parseInt(scan.nextLine());
            if (M > totalM) {
                System.out.println("Insufficient funds. Goodbye.");
            } else if (M > dailyM) {
                System.out.println("Exceeds daily limit. Goodbye.");
            } else { 
                System.out.println("Withdrawal approved.");
                totalM -= M;
                System.out.println(String.format("Balance: $%s", totalM));
            }
        }
        scan.close();
    }
}
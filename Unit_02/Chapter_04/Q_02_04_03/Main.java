package Unit_02.Chapter_04.Q_02_04_03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a = scan.nextLine();
        int i = 0;
        String x = "";
        while (!(a.charAt(i) == ' ')) {
            x += a.charAt(i);
            i++;
        }
        int k = Math.abs(Integer.parseInt(x));
        int l = Math.abs(Integer.parseInt(a.substring(i + 1, a.length())));

        int N = 1;
        
        while (k + l > 10){
            N++;
            a = scan.nextLine();
            i = 0;
            x = "";
            while (!(a.charAt(i) == ' ')) {
                x += a.charAt(i);
                i++;
            }
            k = Math.abs(Integer.parseInt(x));
            l = Math.abs(Integer.parseInt(a.substring(i + 1, a.length())));
        }
        System.out.printf("Darts thrown: %s\nBullseye distance: %s", N, k + l);
        scan.close();
    }
}

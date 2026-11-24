package Unit_02.Chapter_04.Q_02_04_01;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        while (!(name.equals("A girl has no name"))) {
        System.out.printf("hello %s!\nNEXT!\n",name);
        name = scan.nextLine();
        } 
        System.out.println("*sweats profusely*");
        scan.close();
    }
}

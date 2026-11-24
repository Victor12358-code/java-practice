package Unit_02.Chapter_04.Q_02_04_01;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String namelist = "";
        String name = scan.nextLine();
        while (!name.equals("A girl has no name")) {
            namelist += name;
            namelist += "\\";
            name = scan.nextLine();
        }
        String name1 = "";
        for (int i = 0; i < namelist.length(); i++) {
            if (namelist.charAt(i) != '\\') {
                name1 += namelist.charAt(i);
            }
            if (namelist.charAt(i) == '\\') {
                System.out.printf("hello %s!\nNEXT!\n",name1);
                name1 = "";
            }
        }
        System.out.println("*sweats profusely*");
        scan.close();
    }
}

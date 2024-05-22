package day2_Online.day2ex;

import java.util.Scanner;

public class first {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        myprint("Insert A value : ");
        Double a = sc.nextDouble();
        myprint("Insert B value : ");
        Double b = sc.nextDouble();
        sc.close();
        if (a > b) {
            myprint("\nSuccess");
        } else {
            myprint("\nFail");
        }
    }

    static void myprint(String text) {
        System.out.print(text);
    }

}
package day2ex;

import java.util.Scanner;

public class second {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        myprint("Insert A value : ");
        Double a = sc.nextDouble();
        myprint("Insert B value : ");
        Double b = sc.nextDouble();
        sc.close();
        double val = a + b;
        String result;
        if (val > 100 || val < 0) {
            result = "Invalid data";
        } else if (val >= 80) {
            result = "Uk Uk Ak Ak";
        } else if (val >= 75) {
            result = "Duk Dik";
        } else if (val >= 70) {
            result = "Puk Pik";
        } else if (val >= 65) {
            result = "CS Camp";
        } else if (val >= 60) {
            result = "KMITL";
        } else if (val >= 55) {
            result = "Hello World";
        } else if (val >= 50) {
            result = "Khit Mai Ok";
        } else {
            result = "Khit Ok la";
        }
        myprint(result);
        myprint("\nA + B = " + String.valueOf(val));
    }

    static void myprint(String text) {
        System.out.print(text);
    }
}

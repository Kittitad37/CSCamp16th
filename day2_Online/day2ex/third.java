package day2_Online.day2ex;

import java.util.Scanner;
public class third {
    public static void main (String[] arg){
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        sc.close();
        System.out.println(numtotext(val));
    }
    public static String numtotext (int val){
            switch (val){
            case 1 :
               return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            default:
                return "Error";
        }
    }
}

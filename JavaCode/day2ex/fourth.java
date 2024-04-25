package day2ex;

import java.util.Scanner;

public class fourth {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        sc.close();
        String ans;
        switch(third.numtotext(val)){
            case "One":
                ans = "Java";
                break;
            case "Two":
                ans = "C++";
                break;
            case "Three":
                ans = "Python";
                break;
            case "Four":
                ans = "JavaScript";
                break;
            case "Five":
                ans = "Monkey";
                break;
            default :
                ans = "Invalid data";
        }
        System.out.print(ans);
    }
}

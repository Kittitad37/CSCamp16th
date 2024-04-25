package switch_and_case;

import java.util.Scanner;

public class switch_and_case {
    public static void main (String[] arg){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        switch(num){
            case 1: 
                System.out.println("val = 1");
                break;
            case 2:
                System.out.println("val = 2");
                break;
            default :
                System.out.println("val = integer");
        }
    }
}

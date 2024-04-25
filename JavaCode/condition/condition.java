package condition;

import java.util.Scanner;

public class condition {
    public static void main (String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number : ");
        int num = sc.nextInt();
        //System.out.println(num);
        sc.close();
        if (num % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}

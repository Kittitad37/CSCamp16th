package day3;
import java.util.Scanner;

public class ex2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double ans = 0;
        for (int i = 0; i<5 ; i++){
            System.out.print("Enter price : ");
            ans += sc.nextDouble();
        }
        System.out.println("Sum : " + ans + " Baht");
        sc.close();
    }
}
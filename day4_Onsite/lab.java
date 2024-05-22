package day4_Onsite;
import java.util.Scanner;

public class lab {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        int ans = val;
        for (int i = 1; i < val ; i++){
            ans *= val - i;
        }
        sc.close();
        System.out.println(ans);
    }
}
